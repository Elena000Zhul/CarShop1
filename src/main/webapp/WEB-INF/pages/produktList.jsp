<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>
<link rel="stylesheet" href="css/globalStyle.css">


<div class="mini-cart">
</div>
<br>
<a href="/shoppingCart" class="link">Cart Page</a>
<br>
<div class="produktList">
    <c:forEach items="${produkt}" var="produkt">
        <div class="produkt-container " style=" border: 1px solid #ccc; padding: 5px;
    width: 300px; margin: 10px ; display: inline-block;text-align:left;">
            <%--<div class="produkt-container ${product.name}" style=" border: 1px solid #ccc; padding: 5px;--%>
    <%--width: 300px; margin: 10px ; display: inline-block;text-align:left;">--%>
            <a href="produkt${produkt.id}">${produkt.model}</a>
                <%--<img src="${produkt.images[o]}" alt="">--%>
            <div id="img-container" style="max-width: 280px">
                <button class="btnClass" id="prev" onclick="plusImg(-1)">&#10094;</button>
                <c:forEach items="${produkt.images}" var="image">
                    <img src="${image}" class="${image}" id="img-list" alt="" style="border: 1px solid black; width: 260px">
                </c:forEach>
                <button class="btnClass" id="next" onclick="plusImg(1)">&#10095;</button>
            </div>
            <button class="buttonAddToCart" data-art="${produkt.id}" style="margin: 5px; position: relative"> Want!!
            </button>
        </div>
    </c:forEach>

</div>

<script>
//    $(".supercar #img-container img")
</script>


<script>

    var count = 1;
    sliderImg(count);

    function plusImg(n) {
        sliderImg(count += n);
    }

    function sliderImg(n) {
        var i;
//    var x  = $('.produkt-container').find();

        var x = document.getElementsByClassName(${images});

        if (n > x.length) {
            count = 1
        }
        if (n < 1) {
            count = x.length
        }
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        x[count - 1].style.display = "block";

        console.log(x);
    }

    <%--var xxx = $(document.getElementsByName("${images}")) ;--%>
    <%--forEach--%>
    <%--console.log(xxx);--%>


</script>
<script src="js/CartForProdukts.js"></script>
<%--<script scr="js/SlideImages.js"></script>--%>
<%@include file="template/footer.jsp" %>