
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h2>Login</h2>

<div class="container">
    <c:url var="loginn" value="/login"/>
    <form action="${loginn}" method="post">
    <c:if test="${param.error!=null}">
    Login please
    </c:if>
    <c:if test="${param.logout!=null}">
    You logout sucseful
    </c:if>

<input type="text" name="username" placeholder="name">
<input type="password" name="password" placeholder="******">
<input type="submit" value="login">

<input type="hidden"
       name="${_csrf.parameterName}"
       value="${_csrf.token}"/>
</form>

<a href="/">To HomePage</a>

</div>
<%@include file="template/footer.jsp"%>
