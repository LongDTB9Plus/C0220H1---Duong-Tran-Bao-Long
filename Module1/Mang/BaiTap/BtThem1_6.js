var x =[];

for (i=0;i<10;i++) {
    var y = prompt("Nhap So") * 1;
    x.push(y);
}
var v = prompt("Nhap So Can Tim:")*1;
if(x.indexOf(v) !== -1){
    document.write(v + " Co Ton Tai Trong Mang");
}else document.write(V + " Khong Ton Tai Trong Mang");