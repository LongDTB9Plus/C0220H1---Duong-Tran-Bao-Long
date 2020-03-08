var x =[];
var z = 0;
for (i=0;i<10;i++) {
    var y = prompt("Nhap So") * 1;
    x.push(y);
}
var v = prompt("Nhap So Can Tim:")*1;
if(x.indexOf(v) !== -1){
    document.write(v + " Co Ton Tai Trong Mang");
    document.write("<br>");
    for (p = 0; p < 10;p++){
        if (x[p] === v){
            z = p;
            break;
        }
        }for (k = z; k<10;k++){
        if ( k === 9){
            x[k] = 0;
        }else x[k] = x[k+1];
    }document.write("Mang Da Bo Di Gia Tri " + v +" :"+ x);
}else document.write(v + " Khong Ton Tai Trong Mang");