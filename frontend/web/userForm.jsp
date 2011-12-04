<%-- 
    Document   : userForm
    Created on : Dec 1, 2011
    Author     : Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="${actionBean.action} User">
    <s:layout-component name="left">
        <tr>
            <td colspan="2" rowspan="4"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <tr>
            <td colspan="2" rowspan="4" valign="top">
                <!-- Inner table for form data -->
                <table cols="2" rows="5">
                <s:form beanclass="connectedkitchen.action.UserAction" focus="">
                    <tr>
                        <td><label for="fname">First Name</label></td>
                        <td><s:text name="fname" id="fname"/></td>
                    </tr>
                    <tr>
                        <td><label for="lname">Last Name</label></td>
                        <td><s:text name="lname" id="lname"/></td>
                    </tr>
                    <tr>
                        <td><label for="email">Email Address</label></td>
                        <td><s:text name="email" id="email"/></td>
                    </tr>
                    <tr>
                        <td><label for="pass">Password</label></td>
                        <td><s:password name="pass" id="pass"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><s:submit name="register" id="register" value="Register"/></td>
                    </tr>
                </s:form>
                </table>
            </td>
        </tr>
    </s:layout-component>
</s:layout-render>