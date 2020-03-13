var nameCus = prompt("Nhap Ten");
var idNum = prompt("Nhap So CMND");
var dayOb = prompt("Nhap Ngay Thang Nam Sinh");
var email = prompt("Nhap Dia Chi Email");
var address = prompt("Nhap Dia Chi");
var customerType = prompt("Nhap Loai Khach Hang\n 1.Diamond\n 2.Platinum\n 3.Gold\n 4.Silver\n 5.Member");
var disct = prompt("nhap Giam Gia");
var diKem = prompt("Nhap So Luong Di Kem");
var rentDays = prompt("Nhap So Ngay Thue");
var typeService = prompt("Nhap Loai Dich Vu\n 1.Villa = 500$ \n 2.House = 300$\n 3.Room = 100$");
var typeRoom = prompt("Nhap Loai Phong\n 1.VIP\n 2.Business\n 3.Normal");
var totalPrice = 500 * rentDays * (1 - (disct / 100));

alert("Ho Va Ten :" + nameCus +
    "\nSo CMND: " + idNum +
    "\nNgay Sinh: " + dayOb +
    "\nEmail: " + email +
    "\nDia Chi: " + address +
    "\nLoai Khach Hang: " + customerType +
    "\nGiam Gia: " + disct +
    "\nSo Luong Di Kem: " + diKem +
    "\nSo Ngay Thue: " + rentDays +
    "\nLoai Dich Vu: " + typeService +
    "\nLoai Phong: " + typeRoom +
    "\nSo Tien Phai Tra: " + totalPrice);
