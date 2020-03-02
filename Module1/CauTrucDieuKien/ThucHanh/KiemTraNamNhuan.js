var year = prompt("Nhap Nam Can Kiem Tra")*1;
var namNhuan = false;

if (year % 4 == 0){
    if (year % 100 == 0){
        if (year % 400 == 0){
            namNhuan = true;
        }
    }else namNhuan = true;
}

if (namNhuan){
    document.write(year + " La Nam Nhuan");
} else document.write(year + " Khong Phai Nam Nhuan");
