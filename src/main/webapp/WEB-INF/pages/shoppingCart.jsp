<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>


    <%--<c:forEach items="${produkt}" var="produkt">--%>
        <%--<div class="produkt-container-in-cart" style=" border: 1px solid #ccc; padding: 5px;--%>
    <%--width: 300px; margin: 10px ; display: inline-block;text-align:left;">--%>
           <%--<a  href="produkt${produkt.id}">${produkt.model}</a>--%>
        <%--<div id="img-container"  style="max-width: 280px">--%>
            <%--<button class="btnClass" id="prev" onclick="plusImg(-1)">&#10094;</button>--%>
            <%--<c:forEach  items="${produkt.images}" var="image">--%>
                <%--<img src="${image}"  id="img-list"  alt="" style="border: 1px solid black; width: 260px">--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
            <%--<button class="plus" > + </button>--%>
            <%--<button class="minus"> - </button>;--%>
            <%--<button class="delate"> delate</button>--%>

        <%--</div>--%>
    <%--</c:forEach>--%>

   <div class="produrk-in-cart">

       <button class="plus" > + </button>
       <button class="minus"> - </button>;
       <button class="delate"> delate</button>


</div>





<script src = "js/cartProduktiv.js"></script>
<%@include file="template/footer.jsp"%>