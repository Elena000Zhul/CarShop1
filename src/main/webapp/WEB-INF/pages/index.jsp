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

<span style="margin-top: ">Quickest Acceleration.
    Longest Range. The Safest Cars Ever.</span>



  <%@include file="template/footer.jsp"%>
