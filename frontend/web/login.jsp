<%-- 
    Document   : login
    Created on : Dec 1, 2011
    Author     : Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Login">
    <s:layout-component name="left">
        <tr>
            <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.jpg'/>"/></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <s:form beanclass="connectedkitchen.action.LoginAction" focus="">
            <tr>
                <td><label for="email">Email Address</label></td>
                <td><s:text name="email" id="email"/></td>
            </tr>
            <tr>
                <td><label for="pass">Password</label></td>
                <td><s:password name="pass" id="pass"/></td>
            </tr>
            <tr>
                <td colspan="2"><s:submit name="login" id="login" value="Login"/></td>
            </tr>
        </s:form>
        <tr>
            <td colspan="2"><s:errors /></td>
        </tr>
    </s:layout-component>
</s:layout-render>