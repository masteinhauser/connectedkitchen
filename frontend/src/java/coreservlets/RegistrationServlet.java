package coreservlets;

  

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Reads firstName and lastName request parameters and forwards
 *  to JSP page to display them. Uses session-based bean sharing
 *  to remember previous values.
 */

public class RegistrationServlet extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    HttpSession session = request.getSession();
    // get the session from the request object
    NameBean nameBean = // get attribute called nameBean
      (NameBean)session.getAttribute("nameBean");
    // must use the cast because the bean returns as an object
    if (nameBean == null) {
      nameBean = new NameBean(); // instantiate the bean
      session.setAttribute("nameBean", nameBean);
    }
    // get other request parameters and set them in the bean
    String firstName = request.getParameter("firstName");
    if ((firstName != null) && (!firstName.trim().equals(""))) {
      nameBean.setFirstName(firstName);
    }
    String lastName = request.getParameter("lastName");
    if ((lastName != null) && (!lastName.trim().equals(""))) {
      nameBean.setLastName(lastName);
    }
    // set the forwarding address
    String address = "WEB-INF/mvc-sharing/ShowName.jsp";
    // request dispatcher is used to forward
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
