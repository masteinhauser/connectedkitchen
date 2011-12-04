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
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
            <link rel="stylesheet" href="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.css" />
            <script src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
            <script src="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js"></script>
            <s:layout-component name="javascript"/>
        </head>
        <body>
            <div data-role="page" id="home">
                <div data-role="page" id="header">
                    <h1>${title}</h1>
                </div>
                
                <div data-role="page" id="content">
                    <s:layout-component name="page"/>
                </div>
                
                <div data-role="footer" data-position="fixed" data-id="nav">
                    <div data-role="navbar">
                        <ul>
                            <li><s:link beanclass="connectedkitchen.action.mobile.HomeAction" event="mobile" class="ui-btn-active ui-state-persist">Inventory</s:link></li>
                            <li><s:link beanclass="connectedkitchen.action.mobile.InventoryAction" event="mobile">Inventory</s:link></li>
                            <li><s:link beanclass="connectedkitchen.action.mobile.RecipeAction" event="mobile">Recipe</s:link></li>
                            <li><s:link beanclass="connectedkitchen.action.mobile.ShoppingAction" event="mobile">Shopping</s:link></li>
                        </ul>
                    </div>
                </div>
            </div>
        </body>
    </html>
</s:layout-definition>
