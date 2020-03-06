var thuNhap = prompt("Nhap Thu Nhap Ca Nhan Can Tinh Thue");
var thue = 0;
if ( thuNhap < 10000000 ) {
}else if ( thuNhap < 50000000 ) {
    thue = thuNhap * 1/10;
}else if (thuNhap > 100000000)  {
    thue = thuNhap * 2/10;
}
document.write(thue);
