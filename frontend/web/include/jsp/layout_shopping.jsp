<%-- 
    Document   : layout_shopping
    Created on : Oct 22, 2011, 1:05:53 AM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
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
        <td class="button" colspan="2"><s:link beanclass="connectedkitchen.action.ShoppingAction" event="list" style="width: 394px">List</s:link></td>
    </tr>
    <tr>
        <td class="button" valign="bottom"><s:link beanclass="connectedkitchen.action.ShoppingAction" event="add">Add</s:link></td>
        <td class="button" valign="bottom"><s:link beanclass="connectedkitchen.action.ShoppingAction" event="edit">Edit</s:link></td>
    </tr>
</s:layout-definition>