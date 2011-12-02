
package coreservlets;

/**
 *
 * @author Amanda
 */
public class LoginBean {
    private String emailAddress = "Enter email address";
    private String password = "Enter password";
    
    public LoginBean() {
    }
    
    public LoginBean(String emailAddress, String password) {
        setEmailAddress(emailAddress);
        setPassword(password);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
