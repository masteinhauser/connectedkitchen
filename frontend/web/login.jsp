<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
                 Amanda K. Gilles <agilles220@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Connected Kitchen">
    <s:layout-component name="body">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connected Kitchen Login</title>
    </head>
    <body>
                <table col="4" row="5" id="main" align="center">
            <tr>
                <td><s:link beanclass="connectedkitchen.action.HomeAction">Home</s:link></td>
                <td><s:link beanclass="connectedkitchen.action.InventoryAction">Inventory</s:link></td>
                <td><s:link beanclass="connectedkitchen.action.RecipeAction">Recipe</s:link></td>
                <td><s:link beanclass="connectedkitchen.action.ShoppingAction">Shopping</s:link></td>
            </tr>
            <tr>
                <td colspan="2" rowspan="4"><img src="white.jpg" /></td>
            </tr>
            <tr></tr>
            <tr></tr>
            <tr></tr>
            <tr></tr>
        </table>
    </body>

    </s:layout-component>
</s:layout-render>