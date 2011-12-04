<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
                 Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Connected Kitchen">
    <s:layout-component name="left">
        <td colspan="2" rowspan="4"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
        </s:layout-component>
        <s:layout-component name="right">
        <td colspan="2" align="center">
            <p valign="center">Thanks for Registering
                <jsp:useBean id="loginBean" type="coreservlets.LoginBean" 
                             scope="session" />
                <jsp:getProperty name="loginBean" property="emailAddress" />
            </p>
        </td>
    </s:layout-component>
</s:layout-render>