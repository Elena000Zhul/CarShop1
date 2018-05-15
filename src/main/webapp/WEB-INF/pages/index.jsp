<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@include file="template/header.jsp"%>
<link rel="stylesheet" href="css/style.css">

  <div class="menu-container" >

      <a href="/login">Login</a>
      <a href="/registration">Registation</a>


      <a href="/createProdukt">CreateProdukt</a>
      <sec:authorize access="hasRole('ROLE_ADMIN')" >
          <a href="/admin">AdminPage</a>
          <a href="/users">Users</a>

      </sec:authorize>

      <a href="/produktList">produktList</a>
  </div>
<div class="qout">
<span>Quickest Acceleration.
    Longest Range.
    <br> The Safest Cars Ever.</span>
</div>


  <%@include file="template/footer.jsp"%>
