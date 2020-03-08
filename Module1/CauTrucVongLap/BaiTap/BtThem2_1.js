var count = [0,1];
var total = prompt("Nhap So Luong So Cua Dayx Fibonaci Muon Hien Thi")*1;
var x = 0;
var y = 1;
var z = 0;
while (count.length < total) {
    z = x + y;
    count.push(z);
    x = y;
    y = z;
}document.writeln(count);
