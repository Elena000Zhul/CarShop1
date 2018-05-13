console.log("test");
var cart = {}; //пуста корзина
checkCart();
showMiniCart();

$(document).on('click',".buttonAddToCart",function () {
    var produktIdForCart = $(this).data('art');
    if (cart[produktIdForCart] != null) {
        cart[produktIdForCart]++;
    }
    else {
        cart[produktIdForCart] = 1;
    }
    localStorage.setItem('cart', JSON.stringify(cart));
    console.log(cart);
    showMiniCart(); //перезагружаємо корзину при додаванні

});


    
  function  checkCart () {
    if (localStorage.getItem('cart') != null){
        cart = JSON.parse(localStorage.getItem('cart'));
    }
    console.log(cart);
   }


    function showMiniCart() {
       var x = ' ';
       for (var v in cart) {
           x += v + ' ' + cart[v] + '<br>';
       }
       $('.mini-cart').html(x);
       console.log(x);
   };












