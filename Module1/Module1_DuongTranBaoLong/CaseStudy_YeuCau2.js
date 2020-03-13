var nameCus ="Duong Tran Bao Long";
var idNum = "1234567890";
var dayOb = "24/08/1993";
var email = "BaoLongDN@gmail.com";
var address = "Da Nang";
var customerType = "Diamond";
var diKem = 4;
var rentDays = 10;
var typeService = "Villa";
var typeRoom = "VIP";
var discountAdd = 0;
var discountRent = 0;
var discountTypeCus = 0;
var priceService = 0;

if(address === 'Da Nang'){
    discountAdd = 20;
}else if(address === 'Hue'){
    discountAdd = 10;
}else if(address === 'Quang Nam'){
    discountAdd = 5;
}

if (rentDays > 7){
    discountRent = 30;
}else if(rentDays >= 5){
    discountRent = 20;
}else  if (rentDays >= 2){
    discountRent = 10;
}

if(customerType === 'Diamond'){
    discountTypeCus = 15;
}if (customerType === 'Platium'){
    discountTypeCus = 10;
}if (customerType === 'Gold'){
    discountTypeCus = 5;
}if (customerType === 'Silver'){
    discountTypeCus = 5;
}

if (typeService === 'Villa'){
   priceService = 500;
}if (typeService === 'House'){
    priceService = 300;
}if (typeService === 'Room'){
    priceService = 100;
}
var discountTotal = discountTypeCus*1 + discountRent*1 + discountAdd*1;
var choice = prompt("Xin Lua Chon Tac Vu\n1.Hien Thi Thong Tin Khach Hang\n2.Chinh Sua Thong Tin Khach Hang\n3.Hien Thi So Tien Phai Tra ")
switch (choice) {
    case "1":
        alert("1:Ho Va Ten :" + nameCus +
            "\n2:So CMND: " + idNum +
            "\n3:Ngay Sinh: " + dayOb +
            "\n4:Email: " + email +
            "\n5:Dia Chi: " + address +
            "\n6:Loai Khach Hang: " + customerType +
            "\n7:Giam Gia: " + discountTotal +
            "\n8:So Luong Di Kem: " + diKem +
            "\n9:So Ngay Thue: " + rentDays +
            "\n10:Loai Dich Vu: " + typeService +
            "\n11:Loai Phong: " + typeRoom);
        break;
    case  "2":
        var editVal = prompt("1:Ho Va Ten :" + nameCus +
            "\n2:So CMND: " + idNum +
            "\n3:Ngay Sinh: " + dayOb +
            "\n4:Email: " + email +
            "\n5:Dia Chi: " + address +
            "\n6:Loai Khach Hang: " + customerType +
            "\n7:So Luong Di Kem: " + diKem +
            "\n8:So Ngay Thue: " + rentDays +
            "\n9:Loai Dich Vu: " + typeService +
            "\n10:Loai Phong: " + typeRoom);
        switch (editVal) {
            case "1":
                nameCus = prompt("Nhap Ten Khach Hang:");
                break;
            case "2":
                idNum = prompt("Nhap So CMND:");
                break;
            case "3":
                dayOb = prompt("Nhap Ngay Sinh:");
                break;
            case "4":
                email = prompt("Nhap Email:");
                break;
            case "5":
                address = prompt("Nhap Dia Chi:");
                break;
            case "6":
                customerType = prompt("Nhap Loai Khach Hang\n 1.Diamond\n 2.Platinum\n 3.Gold\n 4.Silver\n 5.Member");
                break;
            case "7":
                diKem = prompt("Nhap So Luong Di Kem");
                break;
            case "8":
                rentDays = prompt("Nhap So Ngay Thue");
                break;
            case "9":
                typeService = prompt("Nhap Loai Dich Vu\n 1.Villa = 500$ \n 2.House = 300$\n 3.Room = 100$");
                break;
            case "10":
                typeRoom = prompt("Nhap Loai Phong\n 1.VIP\n 2.Business\n 3.Normal");
                break;
            default:
                alert("Failed");
        }alert("1:Ho Va Ten :" + nameCus +
        "\n2:So CMND: " + idNum +
        "\n3:Ngay Sinh: " + dayOb +
        "\n4:Email: " + email +
        "\n5:Dia Chi: " + address +
        "\n6:Loai Khach Hang: " + customerType +
        "\n7:So Luong Di Kem: " + diKem +
        "\n8:So Ngay Thue: " + rentDays +
        "\n9:Loai Dich Vu: " + typeService +
        "\n10:Loai Phong: " + typeRoom);
        break;
    case "3":
        var totalPrice = priceService * rentDays - discountTotal;
        alert("So Tien Phai Tra Sau Giam Gia La = " + totalPrice);
        break;
    default: alert("Failed");
}




