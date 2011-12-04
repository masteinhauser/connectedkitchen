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
            <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <tr>
            <td colspan="2">${actionBean.message}</td>
        </tr>
        <tr>
            <td rowspan="3" valign="bottom">
                <s:link beanclass="connectedkitchen.action.LoginAction">Login</s:link>
            </td>
            <td rowspan="3" valign="bottom">
                <s:link beanclass="connectedkitchen.action.UserAction">New User</s:link>
            </td>
        </tr>
    </s:layout-component>
</s:layout-render>