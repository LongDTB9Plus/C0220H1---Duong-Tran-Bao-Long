function swap(a, b) {
    var temp = a.value;
    a.value = b.value;
    b.value = temp;
}

var a = {value: 5};
var b = {value: 10};
swap(a, b);
document.write("a = " + a.value + ", b = " + b.value);
