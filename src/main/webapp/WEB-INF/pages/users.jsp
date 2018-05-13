<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<br>
<c:forEach items="${users}" var="user">
    <a href="user${user.id}" >${user.username}</a>
    <%--<br>--%>
    <p>${user}</p>
</c:forEach>




</body>
</html>
