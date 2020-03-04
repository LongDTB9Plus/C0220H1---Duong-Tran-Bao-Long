var a = prompt("Nhap so : ");
var b = prompt("Nhap so : ");
var c = prompt("Nhap so : ");
var max;

if (a > b){
    if (a > c) {max = a;
    } else max = c;
    } else if (b > c) {
    max = b;
} else max = c;
document.write(max);
