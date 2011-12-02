<%-- 
    Document   : layout_main
    Created on : Oct 22, 2011, 1:05:53 AM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>

<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@include file="/include/jsp/taglibs.jsp"%>

<s:layout-definition>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
        "http://www.w3.org/TR/html4/strict.dtd">
    <html>
        <head>
            <title>${title}</title>
            <link rel="stylesheet" type="text/css" href="<c:url value='/include/css/CK.css'/>" />
        </head>
        <body>
            <h2>Connected Kitchen</h2>
            <table col="4" row="5" id="main" align="center">
                <tr>
                    <td><s:link beanclass="connectedkitchen.action.HomeAction">Home</s:link></td>
                    <td><s:link beanclass="connectedkitchen.action.InventoryAction">Inventory</s:link></td>
                    <td><s:link beanclass="connectedkitchen.action.RecipeAction">Recipe</s:link></td>
                    <td><s:link beanclass="connectedkitchen.action.ShoppingAction">Shopping</s:link></td>
                    </tr>
                    <tr>
                    <s:layout-component name="left"/>
                </tr>
                <tr>
                    <s:layout-component name="right"/>
                </tr>
                <tr>
                    <s:layout-component name="center"/>
                </tr>
                <tr>
                    <s:layout-component name="bottom"/>
                </tr>
                <tr></tr>
            </table>
        </body>
    </html>
</s:layout-definition>