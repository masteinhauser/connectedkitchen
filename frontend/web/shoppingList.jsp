<%-- 
    Document   : recipe
    Created on : Oct 21, 2011, 11:45:00 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>
<%@include file="/include/jsp/taglibs.jsp" %>
<s:layout-render name="/include/jsp/layout_main.jsp" title="Shopping | ${actionBean.action}">
    <s:layout-component name="left">
        <td colspan="2" rowspan="4"><img src="<c:url value='/include/img/white.jpg'/>" /></td>
    </s:layout-component>
    <s:layout-component name="right">
        <td colspan="2" rowspan="3" valign="3">
            <s:layout-render name="/include/jsp/layout_shopping.jsp" page="Shopping">
                <s:layout-component name="content">
                    <p>${actionBean.content}</p>
                </s:layout-component>
            </s:layout-render>
        </td>
    </s:layout-component>
</s:layout-render>