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
            <s:layout-component name="center">
            <td rowspan="2" colspan="2" align="center" valign="middle">
                If you have already registered, enter your email address and password.<br />
                For new users, please select the new user link.<br />
            </td>
        </s:layout-component>
        <s:layout-component name="right">
            <form action="reg">
                <td colspan=""2" align="center" valign="middle">
                    <input type="text" name="emailAddress" value="Email Address" size="30" /><br />
                    <input type="text" name="password" value="Password" size="30" /><br />
                    <input type="submit" value="Login" name="submit" />
                </td>
            </form>
        </s:layout-component>
</s:layout-render>