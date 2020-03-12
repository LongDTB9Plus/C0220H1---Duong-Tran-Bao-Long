var a = prompt("Nhap So A");
var b = prompt("Nhap So B");
var c = prompt("Nhap So C");
var min = 0;
function compare(x,y,z) {
 min = x;
 if(x < y){
     if(x > z){
         min = z;
     }
 }else if(y > z){
     min = z;
 }else min = y;
 alert(min);
}
compare(a,b,c);



