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
      <link rel="stylesheet" type="text/css"
        href="${contextPath}/css/style.css">
    </head>
    <body>
      <div id="header">
        <span class="title">${title}</span>
        <p>
            <s:link beanclass="connectedkitchen.action.HomeAction">Home</s:link>
            | <s:link beanclass="connectedkitchen.action.InventoryAction">Inventory</s:link>
            | <s:link beanclass="connectedkitchen.action.RecipeAction">Recipe</s:link>
        </p>
      </div>
      <div id="body">
        <s:layout-component name="body"/>
      </div>
    </body>
  </html>
</s:layout-definition>