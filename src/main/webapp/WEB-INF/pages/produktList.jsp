<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>



<script src="js/SlideImages.js"></script>

<div class="mini-cart" >
   <%--<button class="cartButton">Корзина</button>--%>
</div>
<br>
<a href="/shoppingCart">YourCart</a>
<br>

<c:forEach items="${produkt}" var="produkt">
    <div class="produkt-container" style=" border: 1px solid #ccc; padding: 5px;
    width: 300px; margin: 10px ; display: inline-block;text-align:left;">
    <a href="produkt${produkt.id}" >${produkt.model}</a>
    <%--<img src="${produkt.images[o]}" alt="">--%>
   <div id="img-container"  style="max-width: 280px">
       <button class="btnClass" id="prev" onclick="plusImg(-1)">&#10094;</button>
    <c:forEach  items="${produkt.images}" var="image">
        <img src="${image}" class="img-list" alt="" style="border: 1px solid black; width: 260px">
    </c:forEach>
       <button class="btnClass" id="next" onclick="plusImg(1)">&#10095;</button>
   </div>
    <button class="buttonAddToCart"  data-art="${produkt.id}" style="margin: 5px; position: relative"> Want!! </button>
    </div>
</c:forEach>


</div>

<script>
<%--var ima =document.getAnonymousElementByAttribute("items" , ${produkt.images}"") ;--%>
var count = 1;
sliderImg(count);

function plusImg(n) {
    sliderImg(count += n);
}

function sliderImg (n) {
    var i;
    var x  = document.querySelectorAll(".img-list");
//    var arrayElemants = Array.from(x);
var xx= JSON.stringify(x);
    if(n > arrayElemants.length){count =1}
    if(n < 1){count = arrayElemants.length}
    for (i =0; i<arrayElemants.length; i++){
        arrayElemants[i].style.display ="none";
    }
    arrayElemants[count-1].style.display = "block";

console.log(xx);
}




</script>
<script src="js/CartForProdukts.js"></script>
<%--<script scr="js/SlideImages.js"></script>--%>
<%@include file="template/footer.jsp"%>