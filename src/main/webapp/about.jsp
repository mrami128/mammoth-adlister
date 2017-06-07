<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--


  Created by IntelliJ IDEA.
  User: user
  Date: 6/6/17
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! List<String> fer =new ArrayList<>(); %>
    <% fer.add("Java"); %>

<%! List<String> zach = new ArrayList<>();%>
    <% zach.add("Ruby"); %>

<%! List<String> languages =zach; %>

<c:if test="${param.username == 'fer'}">
    <% languages =fer;%>
</c:if>

<% request.setAttribute("languages",languages); %>
    <html>
    <head>
    <title>ABOUT</title>
    <%-- <%@ include file="partials/head.jsp"%>--%>

 </head>

 <body>

    <c: forEach var="language" items=""${languages}">
        <li>${language}</li>
    </c: forEach>

</body>
</html>
