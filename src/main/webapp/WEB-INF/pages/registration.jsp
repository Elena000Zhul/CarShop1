<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>

<h2>Please registration</h2>

<form action="/save" method="post" enctype="multipart/form-data">
    <input type="text" name="firstName" placeholder="First name" >
    <input type="text" name="lastName" placeholder="Last name" >
    <input type="text" name="username" placeholder="User name " >
    <input type="password" name="password" placeholder="Enter password">
    <input type="email" name="email" placeholder="email">
    <input type="text" name="phoneNumber" placeholder="telephone">
    <input type="file" name="avatar">
    <input type="submit"  value="save" >
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>
<sec:authorize access="isAuthenticated()">
    <p>${user}</p>
</sec:authorize>

<%@include file="template/footer.jsp"%>
