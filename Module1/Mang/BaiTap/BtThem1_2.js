var x =[];
var max = 0;
var posMax = 0

for (i=0;i<10;i++){
    var y = prompt("Nhap So")*1;
    x.push(y);
    if (y > max){
        max = y;
        posMax = i;
    }
}document.write("So Lon Nhat Trong Mang La: " + max);
document.write("<br>");
document.write("Vi Tri Trong Mang: " + posMax);