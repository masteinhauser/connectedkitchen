<%-- 
    Document   : recipe
    Created on : Oct 21, 2011, 11:45:00 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Shopping | Edit">
    <s:layout-component name="body">
        <s:layout-render name="/include/jsp/layout_shopping.jsp" page="Shopping ${actionBean.action}">
            <s:layout-component name="content">
                <p>${actionBean.content}</p>
            </s:layout-component>
        </s:layout-render>
    </s:layout-component>
</s:layout-render>