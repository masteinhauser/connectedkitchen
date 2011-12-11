package connectedkitchen.action;

import connectedkitchen.persistence.entities.UserEntity;
import net.sourceforge.stripes.action.ActionBeanContext;

public class LoginContext extends ActionBeanContext{
    public void clearSession(){
        try{
            getRequest().getSession().invalidate();
        }catch(Exception e){
            // This should be logged, but we don't really care right now if there are errors here.
        }
    }

    public void logout(){
        setUser(null);
    }

    public UserEntity getUser() {
        return (UserEntity) getRequest().getSession().getAttribute("user");
    }

    public void setUser(UserEntity user) {
        getRequest().getSession().setAttribute("user", user);
    }

    public LoginType getLoginType(){
        final UserEntity user = getUser();
        if(user != null){
            if(user.isAdmin()){
                return LoginType.ADMIN;
            } else if (!user.isAdmin()){
                return LoginType.USER;
            } else {
                return LoginType.GUEST;
            }
        } else {
            return LoginType.GUEST;
        }
    }
}
