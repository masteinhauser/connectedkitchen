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
        <td rowspan="3" valign="bottom">
            <a href="login.jsp" id="click">Login</a>
        </td>
        <td rowspan="3" valign="bottom">
            <a href="newUser.jsp" id="click">New User</a>
        </td>
    </s:layout-component>
</s:layout-render>