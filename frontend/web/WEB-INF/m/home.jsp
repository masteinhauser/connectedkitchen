<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
                 Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_mobile.jsp" title="Connected Kitchen">
    <s:layout-component name="page">
        <div style="text-align: center">
            <h2>Home</h2>
        </div>

        <p>${actionBean.message}</p>
    </s:layout-component>
</s:layout-render>
