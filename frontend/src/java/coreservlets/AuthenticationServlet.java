package coreservlets;  

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Reads firstName and lastName request parameters and forwards
 *  to JSP page to display them. Uses session-based bean sharing
 *  to remember previous values.
 */

public class AuthenticationServlet extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    HttpSession session = request.getSession();
    // get the session from the request object
    LoginBean loginBean = // get attribute called loginBean
      (LoginBean)session.getAttribute("loginBean");
    // must use the cast because the bean returns as an object
    if (loginBean == null) {
      loginBean = new LoginBean(); // instantiate the bean
      session.setAttribute("loginBean", loginBean);
    }
    // get other request parameters and set them in the bean
    String emailAddress = request.getParameter("emailAddress");
    if ((emailAddress != null) && (!emailAddress.trim().equals(""))) {
      loginBean.setEmailAddress(emailAddress);
    }
    String password = request.getParameter("password");
    if ((password != null) && (!password.trim().equals(""))) {
      loginBean.setPassword(password);
    }
    // set the forwarding address
    String address = "WEB-INF/mvc-sharing/ShowName.jsp";
    // request dispatcher is used to forward
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
