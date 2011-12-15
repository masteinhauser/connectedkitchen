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
                    <s:form beanclass="connectedkitchen.action.RecipeAction" focus="">
                    <table col="2" row="5" float="right">
                        <tr>
                            <td><label for="title">Recipe Title</label></td>
                            <td><s:text name="title" id="title"/></td>
                        </tr>
                        <tr>
                            <td><label for="ovenTemp">Oven Temp</label></td>
                            <td><s:text name="ovenTemp" id="ovenTemp"/></td>
                        </tr>
                        <tr>
                            <td><label for="bakeTime">Bake Time</label></td>
                            <td><s:text name="bakeTime" id="bakeTime"/></td>
                        </tr>
                        <tr>
                            <td><label for="directions">Directions</label></td>
                            <td><s:text name="directions" id="directions" /></td>
                        </tr>
                        <tr>
                            <td colspan="2"><h5>Will have action to add ingredients here</h5></td>
                        </tr>

                        <tr>
                            <td></td>
                            <td><Input type="checkbox" name="favorite">My Favorite</input></td>
                        </tr>
                        <tr>
                            <td class="button" valign="top"><s:button name="clear" id="clear" value="Clear"/></td>
                            <td class="button" valign="top"><s:submit name="save" id="save" value="Save"/></td>
                        </tr>
                    </table>
                </s:form>
            </s:layout-component>
        </s:layout-render>
    </s:layout-component>
</s:layout-render>
