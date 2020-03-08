var count = [0,1];
var x = 0;
var y = 1;
var z = 0;
while (count.length < 20) {
    z = x + y;
    count.push(z);
    x = y;
    y = z;
document.write(count);
