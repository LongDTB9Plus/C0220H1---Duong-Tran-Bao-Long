var namelogin = prompt("Xin Dang Nhap");

if (namelogin === "Admin"){
    var pass = prompt("Xin Nhap Mat Khau");
    if (pass === "TheMaster"){
        document.write("Welcome!");
    }else if (pass === ""){
        document.write("Canceled");
    }else document.write("Sai Mat Khau");
}else if (namelogin === ""){
    document.write("Canceled");
}else document.write("I dont know you!");