package connectedkitchen.persistence.control;

import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.controller.Interceptor;

/**
 * Closes all Hibernate EntityManagers at the end of the request.
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Intercepts(LifecycleStage.RequestComplete)
public class HibernateInterceptor implements Interceptor{
    @Override
    public Resolution intercept(ExecutionContext ctx) throws Exception {
            Resolution rval =  ctx.proceed();
            EntityController.closeSession();
            return rval;
    }
}
