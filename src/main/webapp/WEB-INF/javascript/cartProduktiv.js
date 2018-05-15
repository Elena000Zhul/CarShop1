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


function showCart () {
        if ($.isEmptyObject(cart)){
            var out = 'Sopping cart is empty';
            $('.produrk-in-cart').html(out);
        }else{
            var o = ' ' ;
            for (var r in cart) {
        o += r + ' ' + cart[r] + '<br>';

        // for (var i in $(produkt.images)){
        //    o+= ' <img src="$(produkt[i].image)">';
        // }
        o += '<button class="minus" data-art="'+r+'"> - </button>';
        o += '<button class="plus" data-art="'+r+'"> + </button>';
        o += '<button class="delate" data-art="'+r+'"> delate </button>'

    }
    $('.produrk-in-cart').html(o);
    console.log(o);
    $('.plus').on('click', plusPro);
    $('.minus').on('click',  minusPro);
    $('.delate').on('click',  delatePro);
}}


function plusPro() {
    var artt = $(this).attr('data-art');
    cart[artt]++;
    updateCart();
    showCart();
}


function minusPro() {
    var artt = $(this).attr('data-art');
    if (cart[artt]>1){
        cart[artt]--;
    }
   else {
        delete cart[artt];
    }
    updateCart();
    showCart();
}

function delatePro() {
    var artt = $(this).attr('data-art');
        delete cart[artt];
    updateCart();
    showCart();
}

function updateCart() {
    localStorage.setItem('cart', JSON.stringify(cart));
}



