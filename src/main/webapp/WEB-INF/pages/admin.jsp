<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>


<c:forEach items="${users}" var="user">
    <a href="user${user.id}" >${user.username}</a>
    <br>
</c:forEach>


<div class="container">
<p>${principal}</p>
</div>


<a href="/logout">logout</a>


<%@include file="template/footer.jsp"%>
