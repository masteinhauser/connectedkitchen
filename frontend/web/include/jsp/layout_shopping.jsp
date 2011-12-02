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
        <table>
            <tr>
                <td colspan="2"><s:link beanclass="connectedkitchen.action.ShoppingAction" event="list">List</s:link></td>
            </tr>
            <tr>
                <td><s:link beanclass="connectedkitchen.action.ShoppingAction" event="add">Add</s:link></td>
                <td><s:link beanclass="connectedkitchen.action.ShoppingAction" event="edit">Edit</s:link></td>
            </tr>
        </table>
        <br />
        <s:layout-component name="content"/>
      </div>
</s:layout-definition>