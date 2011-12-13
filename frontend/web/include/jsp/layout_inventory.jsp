<%-- 
    Document   : layout_inventory
    Created on : Dec 11, 2011, 11:09:36 AM
    Author     : Amanda Gilles <agilles220@gmail.com>
--%>

<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@include file="/include/jsp/taglibs.jsp"%>

<s:layout-definition>        
    <tr>
        <td colspan="2"><span class="page">${page} Page</span></td>
    </tr>
    <tr>
        <td colspan="2" height="450">
            <s:layout-component name="content"/>
        </td>
    </tr>
    <tr>
        <td  class="button" colspan="2"><s:link beanclass="connectedkitchen.action.InventoryAction" event="list" style="width: 394px">List</s:link></td>
    </tr>
    <tr>
        <td class="button" valign="bottom"><s:link beanclass="connectedkitchen.action.InventoryAction" event="add">Add</s:link></td>
        <td class="button" valign="bottom"><s:link beanclass="connectedkitchen.action.InventoryAction" event="edit">Edit</s:link></td>
    </tr>
</s:layout-definition>
