<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Home">
    <s:layout-component name="body">
        <h3>Home Page</h3>
        <p>
            Date and time:
            <br>
            <b>
                <fmt:formatDate type="both" dateStyle="full"
                                value="${actionBean.date}" />
            </b>
        </p>
        <p>
            <s:link beanclass="connectedkitchen.action.HomeBaseAction"
                    event="currentDate" >
                Show the current date and time
            </s:link> |
            <s:link beanclass="connectedkitchen.action.HomeBaseAction"
                    event="randomDate" >
                Show a random date and time
            </s:link>
        </p>
    </s:layout-component>
</s:layout-render>