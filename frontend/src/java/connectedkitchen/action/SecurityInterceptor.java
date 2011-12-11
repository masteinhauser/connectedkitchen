package connectedkitchen.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;


@Intercepts(LifecycleStage.HandlerResolution)
public class SecurityInterceptor implements Interceptor {
    
    /* Intercepts execution and checks that the user has appropriate permissions. */
    @Override
    public Resolution intercept(ExecutionContext ctx) throws Exception {

        Class<? extends ActionBean> actionBeanClass = ctx.getActionBean().getClass();
        LoginRequired loginReq = actionBeanClass.getAnnotation(LoginRequired.class);
        LoginType activeRole = ((LoginContext) ctx.getActionBeanContext()).getLoginType();

        if(loginReq != null && !match(loginReq.type(), activeRole)){
            return new ForwardResolution(connectedkitchen.action.HomeAction.class);
        } else {
            return ctx.proceed();
        }
    }

    private boolean match(LoginType[] types, LoginType active){
        for(LoginType type : types){
            if(type == active){
                return true;
            }
        }
        return false;
    }

}