function process() {
    var month = (document.getElementById("month")).value * 1 ;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.write("Thang " + month + " Co 31 Ngay");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            document.write("Thang " + month + " Co 30 Ngay");
            break;
        case 2:
            document.write("Thang " +month + " Co 28 Hoac 29 Ngay");
            break;
        default:
            document.write(" Nhap Sai ");
    }

}