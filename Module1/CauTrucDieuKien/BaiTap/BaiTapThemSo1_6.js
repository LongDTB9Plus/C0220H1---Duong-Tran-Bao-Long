var doanhSo = prompt("Nhap Doanh So Ban Hang : ");
var hoaHong ;

if ( doanhSo >= 20000000 ) {
    hoaHong = (doanhSo * (1/10));
}   else if( doanhSo >= 1000000 ) {
    hoaHong = (doanhSo *(1/20));
}   else  hoaHong = (doanhSo * (3/100));
document.write(hoaHong);