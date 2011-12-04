<%-- 
    Document   : inventory
    Created on : Oct 21, 2011, 11:40:00 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Inventory">
    <s:layout-component name="left">
        <td colspan="2" rowspan="4"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
    </s:layout-component>
    <s:layout-component name="right">
        <tr>
            <td colspan="2" rowspan="4" valign="bottom">
                <p>${actionBean.message}</p>
            </td>
        </tr>
    </s:layout-component>
</s:layout-render>