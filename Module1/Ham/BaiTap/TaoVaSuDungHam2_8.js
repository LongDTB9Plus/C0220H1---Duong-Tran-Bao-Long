var a =[];
d = prompt("Nhap So Phan Tu Muon Nhap Vao:");
function inputArray(z) {
for( var i = 0; i<z;i++){
    a.push(prompt("Nhap Phan Tu:")) ;
}
}
inputArray(d);
function rev() {
alert(a.reverse());
}

rev();