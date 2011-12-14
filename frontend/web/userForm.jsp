<%-- 
    Document   : userForm
    Created on : Dec 1, 2011
    Author     : Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="${actionBean.action} User">
    <s:layout-component name="left">
        <tr>
            <td colspan="2" rowspan="4"><img src="<c:url value='/include/img/white.png'/>" /></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <tr>
            <td colspan="2" rowspan="4" valign="top">
                <!-- Inner table for form data -->
                <table cols="2" rows="5">
                <s:form beanclass="connectedkitchen.action.UserAction" focus="">
                    <tr>
                        <td><label for="firstName">First Name</label></td>
                        <td><s:text name="firstName" id="firstName" value="${actionBean.firstName}"/></td>
                    </tr>
                    <tr>
                        <td><label for="lastName">Last Name</label></td>
                        <td><s:text name="lastName" id="lastName" value="${actionBean.lastName}"/></td>
                    </tr>
                    <tr>
                        <td><label for="emailAddress">Email Address</label></td>
                        <td><s:text name="emailAddress" id="emailAddress" value="${actionBean.emailAddress}"/></td>
                    </tr>
                    <tr>
                        <td><label for="password">Password</label></td>
                        <td><s:password name="password" id="password"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><s:submit name="${actionBean.type}" id="submit" value="${actionBean.type}" style="text-transform:capitalize" /></td>
                    </tr>
                </s:form>
                </table>
            </td>
        </tr>
    </s:layout-component>
</s:layout-render>