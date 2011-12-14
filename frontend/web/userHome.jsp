<%-- 
    Document   : usersHome
    Created on : Dec 8, 2011, 6:04:08 PM
    Author     : Amanda
--%>

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
            <td colspan="2" rowspan="6"><img src="<c:url value='/include/img/white.png'/>" /></td>
        </tr>
    </s:layout-component>
    <s:layout-component name="right">
        <tr>
            <td colspan="2" rowspan="6" valign="top">${actionBean.message}</td>
        </tr>
    </s:layout-component>
</s:layout-render>
