var a = prompt("Nhap so a: ");
var b = prompt("Nhap so b=: ");

if (b == '0'){
    document.write("Khong The Chia Cho 0");
}else if (a % b == '0') {
    document.write("a Chia Het Cho B");
}else document.write("a Khong Chia Het Cho B");