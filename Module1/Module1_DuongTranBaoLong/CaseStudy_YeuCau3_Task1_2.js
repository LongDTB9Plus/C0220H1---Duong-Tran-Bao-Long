var nameCus = prompt("Nhap Ten").trim();
nameCus = nameCus.toLowerCase();
nameCus = nameCus.substring(0, 1).toUpperCase() + nameCus.substring(1);
for (p = 1; p < nameCus.length; p++) {
    if (nameCus.charAt(p) === " ") {
        nameCus = nameCus.substring(0, p) + nameCus.substring(p, p + 2).toUpperCase() + nameCus.substring(p + 2);
    }
}
var idNum = prompt("Nhap So CMND");
var idCheck = false;
while (idCheck === false) {
    for (var i = 0; i < idNum.length; i++) {
        var numberCheck = idNum[i] * 1;
        if ((Number.isInteger(numberCheck) === false) || ((numberCheck) < 0)) {
            idNum = prompt("So CMND Khong Hop Le\nNhap Lai So CMND");
            break;
        } else idCheck = true;
    }
}
var dayOb = prompt("Nhap Ngay Thang Nam Sinh");
var checkOb = false;
while (checkOb === false) {
    if ((dayOb[2] !== "/") ||
        (dayOb[5] !== "/") ||
        ((dayOb[3] + dayOb[4]) * 1 > 12) ||
        (dayOb.length > 10) ||
        ((dayOb[0] + dayOb[1]) * 1 > 31)) {
        var dayOb = prompt("Ngay Thang Nam Sinh Khong Hop Le\nNhap Lai");
    } else checkOb = true;
}
var checkOb = true;
var email = prompt("Nhap Dia Chi Email");
var checkEmail = true;
var address = prompt("Nhap Dia Chi");
address = address.toLowerCase();
address = address.substring(0, 1).toUpperCase() + address.substring(1);
for (p = 1; p < address.length; p++) {
    if (address.charAt(p) === " ") {
        address = address.substring(0, p) + address.substring(p, p + 2).toUpperCase() + address.substring(p + 2);
    }
}
var customerType = prompt("Nhap Loai Khach Hang\n 1.Diamond\n 2.Platinum\n 3.Gold\n 4.Silver\n 5.Member");
customerType = customerType.toLowerCase();
customerType = customerType.substring(0, 1).toUpperCase() + customerType.substring(1);
var disct = prompt("nhap Giam Gia");
var diKem = prompt("Nhap So Luong Di Kem");
while ((Number.isInteger(diKem * 1) === false) || (diKem * 1 < 0) || (diKem === "")) {
    diKem = prompt("Xin Nhap Gia Tri La So Nguyen Duong:");
}
var rentDays = prompt("Nhap So Ngay Thue");
while ((Number.isInteger(rentDays * 1) === false) || (rentDays * 1 < 0) || (rentDays === "")) {
    rentDays = prompt("Xin Nhap Gia Tri La So Nguyen Duong:");
}
var typeService = prompt("Nhap Loai Dich Vu\n 1.Villa = 500$ \n 2.House = 300$\n 3.Room = 100$");
var typeRoom = prompt("Nhap Loai Phong\n 1.VIP\n 2.Business\n 3.Normal");

