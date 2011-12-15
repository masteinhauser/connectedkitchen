<%-- 
    Document   : inventoryForm
    Created on : Dec 11, 2011, 11:05:13 AM
    Author     : Amanda Gilles <agilles220@gmail.com>
--%>

<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Add Inventory| ${actionBean.action}">
    <s:layout-component name="left">
        <td colspan="2" rowspan="5"><img src="<c:url value='/include/img/white.png'/>" /></td>
        </s:layout-component>
        <s:layout-component name="right">
            <s:layout-render name="/include/jsp/layout_inventory.jsp" page="Add Inventory">
                <s:layout-component name="content">
                    <s:form beanclass="connectedkitchen.action.InventoryAction" focus="">
                    <table col="2" row="5" float="right">
                        <tr>
                            <td><label for="description">Description</label></td>
                            <td><s:text name="description" id="description"/></td>
                        </tr>
                        <tr>
                            <td><label for="measureID">Unit of Measure</label></td>
                            <td>
                                <select name="measureID">
                                    <OPTION VALUE="None" SELECTED>None
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td><label for="quantity">Quantity</label></td>
                            <td><s:text name="quantity" id="quantity"/></td>
                        </tr>
                        <tr>
                            <td><label for="expires">Expiration Date</label></td>
                            <td><s:text name="expires" id="expires"/></td>
                        </tr>
                        <tr>
                            <td><Input type="radio" name="stockYes" value="y">Always Stock</input>
                            <td><Input type="radio" name="stockNo" value="n">Don't Stock</input></td>
                        </tr>
                        <tr height="150">
                            <td></td>
                            <td></td>
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
