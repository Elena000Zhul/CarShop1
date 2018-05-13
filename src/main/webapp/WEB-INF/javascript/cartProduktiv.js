var cart = {};
checkCart();
// console.log(cart);
$('.produrk-in-cart').html(cart);
showCart();

function  checkCart () {
    if (localStorage.getItem('cart') != null){
        cart = JSON.parse(localStorage.getItem('cart'));
    }
}

// джейсоном витягти продукт в змінну і передати в фор
function showCart () {
   var o = ' ' ;
    for (var r in cart) {
        // o += r + ' ' + cart[r] + '<br>';
        o += '<button class=delate">Delate</button>';
        // o += '<img src="${images}">';

        // for (var i in $(produkt.images)){
        //    o+= ' <img src="$(produkt[i].image)">';
        // }
        // o += '<button class="minus"> - </button>';

        // o += '<button class="plus"> + </button>';


    }

    $('document .plus').on('click', function () {


    })


    $('.produrk-in-cart').html(o);
    console.log(o);
}








