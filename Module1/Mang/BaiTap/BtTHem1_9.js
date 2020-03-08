var a =[];
var b =[];
var c =[];
for (i=0;i<10;i++) {
    var x = prompt("Nhap So Vao Mang A:") * 1;
    a.push(x);
}
for (p=0;p<10;p++) {
    var y = prompt("Nhap So Vao Mang B:") * 1;
    b.push(y);
}
c = a.concat(b);
document.write(c);