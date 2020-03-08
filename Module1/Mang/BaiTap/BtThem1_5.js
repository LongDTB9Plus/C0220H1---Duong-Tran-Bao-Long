var x =[];
var count = 0;
var z = prompt("Nhap So Luong Phan Tu Trong Mang")*1;
for (i=0;i<z;i++){
    var y = prompt("Nhap So")*1;
    x.push(y);
    if (y < 0){
        count++;
    }
}document.write("So Luong So Nguyen Am: " + count);