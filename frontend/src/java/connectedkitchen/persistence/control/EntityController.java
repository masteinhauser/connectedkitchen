package connectedkitchen.persistence.control;

import org.apache.log4j.Logger;

import java.util.Map;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class EntityController {
    private static final Logger log = Logger.getLogger(EntityController.class);
    protected static ThreadLocal<EntityManager> tlem = new ThreadLocal();
    static protected EntityManagerFactory emf;

    static {
        try{
            emf = Persistence.createEntityManagerFactory("ConnectedKitchenPU", DBProps.buildPersistenceProperties());
        } catch (Exception e){
            log.error("exception",e);
            throw new RuntimeException(e);
        }
    }



    public static class DBProps{
        public static Map buildPersistenceProperties() {
            final Map ret = new HashMap();
            ret.put("hibernate.connection.username", "connectedkitchen");
            ret.put("hibernate.connection.password", "cvtcCK");
            ret.put("hibernate.connection.url", "jdbc:postgresql://ck.kastlersteinhauser.com/connectedkitchen");
            ret.put("hibernate.connection.driver_class", "org.postgresql.Driver");
            ret.put("hibernate.cache.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
            ret.put("hibernate.connection.pool_size", "1");
            ret.put("hibernate.connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
            ret.put("hibernate.cache.use_second_level_cache", "true");
            ret.put("hibernate.c3p0.max_size", "20");
            ret.put("hibernate.c3p0.idleConnectionTestPeriod", "300");
            ret.put("hibernate.c3p0.timeout", "60");
            return ret;
        }
    }

    public static EntityManager entityManager(){
        if(tlem.get() == null || !tlem.get().isOpen()){
            tlem.set(emf.createEntityManager());
            if(!tlem.get().isOpen()){
                System.out.println("WARNING - fresh EM is closed!");
            }
        }
        return tlem.get();
    }

    protected EntityManager getEntityManager(){
        if(tlem.get() == null || !tlem.get().isOpen()){
            tlem.set(emf.createEntityManager());
            if(!tlem.get().isOpen()){
                System.out.println("WARNING - fresh EM is closed!");
            }
        }
        return tlem.get();
    }

    public static void closeSession(){
        if(tlem.get() != null){
            if(tlem.get().isOpen()){
                tlem.get().close();
            }
            tlem.remove();
        }
    }

    protected Long scalarQuery(String jpaQuery, Map<String,Object> params){
        Long rval = null;
        EntityManager em = getEntityManager();
        try{
            Query q = em.createQuery(jpaQuery);
            if(params != null){
                for(String key : params.keySet()){
                    q.setParameter(key, params.get(key));
                }
            }
            rval = (Long)(q.getSingleResult());
        } catch (Exception e){
            log.error("exception",e);
        }
        return rval;
    }

    protected Long scalarQuery(String jpaQuery){
        return scalarQuery(jpaQuery, null);
    }

    protected void rollbackIfActive(EntityManager em) {
        if (em != null && em.getTransaction() != null && em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
    }
}