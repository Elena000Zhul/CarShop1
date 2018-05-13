<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>





<h2>Create new produkt</h2>
<form action="/saveProdukt" method="post" enctype="multipart/form-data">
    <input type="text" name="firmName">
    <input type="text" name="model">
    <input type="text" name="price">
    <input type="file" multiple name="images">
    <input type="submit" name="save Produkt">
<input type="hidden"
    name="${_csrf.parameterName}"
    value="${_csrf.token}"/>
</form>



<%@include file="template/footer.jsp"%>