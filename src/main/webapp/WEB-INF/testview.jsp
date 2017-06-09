<%--
  move the html from testSevlet SERVLET to this JSP View to keep html out of controller servlets
   --> so over in SERVLET use the request.getRequestDispatcher("/WEB-INF/testview.jsp").forward(request,response);
   --->put that in SERVLET..directing it here to show html on screen HTML goes in JSP's

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><B> Buddy! this works Testing the /testServ-from jsp side</B></h1>
</body>
</html>
