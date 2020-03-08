var x =[];
var count = 0;

for (i=0;i<10;i++){
    var y = prompt("Nhap So")*1;
    x.push(y);
    if (y >= 10){
        count++;
    }
}document.write("So Luong Phan Tu Lon Hon Hoac Bang 10: " + count);