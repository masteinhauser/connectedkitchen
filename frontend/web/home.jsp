<%-- 
    Document   : home
    Created on : Oct 20, 2011, 7:42:24 PM
    Author     : Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
--%>

<%@page contentType="text/html;charset=ISO-8859-1" language="java" %>

<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
    "http://www.w3.org/TR/html4/strict.dtd" >
<html>
    <head>
        <title>Hello, Stripes!</title>
    </head>
    <body>
        <h3>Hello, Stripes!</h3>
        <p>
            Date and time:
            <br>
            <b>
                <fmt:formatDate type="both" dateStyle="full"
                                value="${actionBean.date}" />
            </b>
        </p>
        <p>
            <s:link beanclass="connectedkitchen.action.HomeAction"
                    event="currentDate" >
                Show the current date and time
            </s:link> |
            <s:link beanclass="connectedkitchen.action.HomeAction"
                    event="randomDate" >
                Show a random date and time
            </s:link>
        </p>
    </body>
</html>