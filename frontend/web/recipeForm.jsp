<%-- 
    Document   : recipeForm
    Created on : Dec 10, 2011, 9:03:08 PM
    Author     : Amanda Gilles <agilles220@gmail.com>
--%>

<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Recipe Entry| ${actionBean.action}">
    <s:layout-component name="left">
        <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.png'/>" /></td>
    </s:layout-component>
    <s:layout-component name="right">
        <s:layout-render name="/include/jsp/layout_recipe.jsp" page="Recipe Entry">
            <s:layout-component name="content">
                ${actionBean.content}
            </s:layout-component>
        </s:layout-render>
    </s:layout-component>
</s:layout-render>
