<%-- 
    Document   : inventory
    Created on : Oct 21, 2011, 11:40:00 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Inventory">
    <s:layout-component name="body">
        <h3>Inventory Page</h3>
        <p>${actionBean.test}</p>
    </s:layout-component>
</s:layout-render>