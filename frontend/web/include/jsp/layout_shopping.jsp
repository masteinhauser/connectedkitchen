<%-- 
    Document   : layout_main
    Created on : Oct 22, 2011, 1:05:53 AM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>

<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@include file="/include/jsp/taglibs.jsp"%>

<s:layout-definition>        
      <div id="content">
        <span class="page">${page} Page</span>
        <br />
        <s:link beanclass="connectedkitchen.action.ShoppingAction" event="list">List</s:link>
        <s:link beanclass="connectedkitchen.action.ShoppingAction" event="add">Add</s:link>
        <s:link beanclass="connectedkitchen.action.ShoppingAction" event="edit">Edit</s:link>
        <br />
        <s:layout-component name="content"/>
      </div>
    </body>
  </html>
</s:layout-definition>