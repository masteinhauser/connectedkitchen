<%-- 
    Document   : layout_recipe
    Created on : Dec 9, 2011, 12:24:16 PM
    Author     : Amanda
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
        <td colspan="2"><s:link beanclass="connectedkitchen.action.RecipeAction" event="search" style="width: 394px">Search</s:link></td>
    </tr>
    <tr>
        <td><s:link beanclass="connectedkitchen.action.RecipeAction" event="add">Add</s:link></td>
        <td><s:link beanclass="connectedkitchen.action.RecipeAction" event="edit">Edit</s:link></td>
    </tr>
</s:layout-definition>