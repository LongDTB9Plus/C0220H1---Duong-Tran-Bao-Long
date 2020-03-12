var a = prompt("Nhap So A:")*1;
var b = prompt("Nhap So B:")*1;
var total = 0;

function compare(x,y) {
    if (x <= y){
        total = x + y;
        alert(total);
    }else alert(x+ " > " +y);
}
compare(a,b);