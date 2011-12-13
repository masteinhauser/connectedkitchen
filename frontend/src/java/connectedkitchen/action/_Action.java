package connectedkitchen.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class _Action implements ActionBean {

    protected LoginContext context;
    String message; 

    @Override
    public LoginContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = (LoginContext) context;
    }
    
    public String getMessage(){
        return message;
    }
}
