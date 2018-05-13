var count = 1;
sliderImg(count);

function plusImg(n) {
    sliderImg(count += n);
}

function sliderImg (n) {
    var i;
    var x = document.getElementById("img-count");
    if(n > x.length){count =1}
    if(n < 1){count = x.length}
    for (i =0; i<x.length; i++){
        x[i].style.display ="none";
    }
    x[count-1].style.display = "block";


}


