var a = prompt("Nhap Ky Tu")*1;

function check(s) {
    var result = false;
    var b = (s - 1);
if (!Number.isNaN(b)) {
    result = true
}else result = false;
document.write(result);
}
check(a);


