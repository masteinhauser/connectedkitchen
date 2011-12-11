<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
                 Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Connected Kitchen">
    <s:layout-component name="left">
        <tr>
            <td colspan="2" rowspan="6"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <s:form beanclass="connectedkitchen.action.LoginAction" focus="">
            <tr>
                <td colspan="2">${actionBean.message}</td>
            </tr>
            <tr>
                <td height="30" valign="bottom"><label for="email">Email Address</label></td>
                <td height="30" valign="bottom"><s:text name="email" id="email"/></td>
            </tr>
            <tr>
                <td valign="top"><label for="pass">Password</label></td>
                <td valign="top"><s:password name="pass" id="pass"/></td>
            </tr>
            <tr>
                <td colspan="2" valign="top"><s:submit name="login" id="login" value="Login"/></td>
            </tr>
        </s:form>
        <td rowspan="1" colspan="2" valign="bottom">
            <s:link beanclass="connectedkitchen.action.UserAction" event="list" style="width: 394px" >New User</s:link>
            <s:errors />
        </td>
    </tr>
</s:layout-component>
</s:layout-render>
