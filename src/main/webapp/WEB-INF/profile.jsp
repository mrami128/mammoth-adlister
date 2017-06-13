<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">

        <%--TODO: done added.. use c:out here because its user input generating this --%>

        <h1>Welcome,
            <c:out value="${sessionScope.user.username}"/>!</h1>
            <%--  ${sessionScope.user}!</h1>  --%>
    </div>

</body>
</html>
