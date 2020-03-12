var a = prompt("Nhap Ban Kinh Hinh Tron:")*1;
var dienTich = 0;
var chuVi = 0;
function tinhChuVi(num) {
    chuVi = num * 2 * Math.PI;
    document.write("Chu Vi: " +chuVi);
}
function tinhDienTich(num) {
    dienTich = num**2 * Math.PI;
    document.write("Dien Tich: " +dienTich);
}
tinhChuVi(a);
document.write("<br>");
tinhDienTich(a);
