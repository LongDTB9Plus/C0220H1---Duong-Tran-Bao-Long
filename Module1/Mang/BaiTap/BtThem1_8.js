var x =[];

for (i=0;i<10;i++) {
    var y = prompt("Nhap So") * 1;
    x.push(y);
}
x.sort(function (a,b) {
return b-a;
});
document.write(x);