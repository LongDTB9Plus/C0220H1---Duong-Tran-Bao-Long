var a = prompt("Nhap Gia Tri a");
var b = prompt("Nhap Gia Tri b");
var c = prompt("Nhap Gia Tri c");
var x1 = ((-1*b) + Math.sqrt((b*b) - 4*a*c))/ (2*a);
var x2 = ((-1*b) - Math.sqrt((b*b) - 4*a*c))/ (2*a);
alert('x1=' + x1);
alert('x2=' + x2);