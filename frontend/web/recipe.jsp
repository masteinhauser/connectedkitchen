<%-- 
    Document   : recipe
    Created on : Oct 21, 2011, 11:45:00 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
                 Amanda Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Recipes">
    <s:layout-component name="left">
        <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.png'/>" /></td>
    </s:layout-component>
    <s:layout-component name="right">
        <s:layout-render name="/include/jsp/layout_recipe.jsp" page="Recipe">
            <s:layout-component name="content">
                ${actionBean.content}
            </s:layout-component>
        </s:layout-render>
    </s:layout-component>
</s:layout-render>