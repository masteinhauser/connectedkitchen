<%-- 
    Document   : recipeList
    Created on : Dec 10, 2011, 8:49:54 PM
    Author     : Amanda Gilles <agilles220@gmail.com>
--%>

<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Recipe Search | ${actionBean.action}">
    <s:layout-component name="left">
        <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.png'/>" /></td>
        </s:layout-component>
        <s:layout-component name="right">
            <s:layout-render name="/include/jsp/layout_recipe.jsp" page="Recipe Search">
                <s:layout-component name="content">
                    ${actionBean.content}
                </s:layout-component>
            </s:layout-render>
        </s:layout-component>
    </s:layout-render>

