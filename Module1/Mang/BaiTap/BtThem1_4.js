var x =[];
var max = 0;
var posMax = 0;
var z = prompt("Nhap So Luong Phan Tu Trong Mang")*1;

for (i=0;i<z;i++){
    var y = prompt("Nhap So")*1;
    x.push(y);

}document.write(x);
document.write("<br>");
document.write(x.reverse());