var arrListCustomers = [];
var mainCheck = false;
function stringValid(stringIn) {
    stringIn = stringIn.toLowerCase();
    stringIn = stringIn.substring(0, 1).toUpperCase() + stringIn.substring(1);
    for (p = 1; p < stringIn.length; p++) {
        if (stringIn.charAt(p) === " ") {
            stringIn = stringIn.substring(0, p) + stringIn.substring(p, p + 2).toUpperCase() + stringIn.substring(p + 2);
        }
    }
    return stringIn;
}

function numberIntergerCheckValid(number) {
    var idCheck = false;
    while (idCheck === false) {
        for (var i = 0; i < number.length; i++) {
            var numberCheck = number[i] * 1;
            if ((Number.isInteger(numberCheck) === false) || ((numberCheck) < 0)) {
                number = prompt("So Khong Hop Le\nNhap Lai So");
                break;
            } else idCheck = true;
        }
    }
    return number;
}

function monthDateCheckValid(monthDate) {
    var checkOb = false;
    while (checkOb === false) {
        if ((monthDate[2] !== "/") ||
            (monthDate[5] !== "/") ||
            ((monthDate[3] + monthDate[4]) * 1 > 12) ||
            (monthDate.length > 10) ||
            ((monthDate[0] + monthDate[1]) * 1 > 31) ||
            (Number.isInteger(monthDate.substring(0, 2) * 1) === false) ||
            (Number.isInteger(monthDate.substring(3, 5) * 1) === false) ||
            (Number.isInteger(monthDate.substring(6) * 1) === false)) {
            monthDate = prompt("Ngay Thang Nam Sinh Khong Hop Le\nNhap Lai");
        } else checkOb = true;
    }
    return monthDate;
}

function emailCheckValid(email) {
    let checkEmail = false;
    while (checkEmail === false) {
        if ((email.length >= 11) && (email.indexOf('@') > 0) && ((email.indexOf('.')) === (email.length - 4))) {
            checkEmail = true;
        } else email = prompt("Dia Chi Email Khong Hop Le\nNhap Lai");
    }
    return email;
}

function typeCustomerValidCheck(cusInput,rowCusVal) {
    cusInput = cusInput.toLowerCase();
    cusInput = cusInput.substring(0, 1).toUpperCase() + cusInput.substring(1);
    var typeCheck = false;
    while (typeCheck === false) {
        switch (cusInput) {
            case "Diamond":
            case "Platinum":
            case "Gold":
            case "Silver":
            case "Member":
                arrListCustomers[rowCusVal][5] = cusInput;
                typeCheck = true;
                break;
            default:
                cusInput = prompt("Loai Khach Hang Khong Hop Le \nXin Nhap Lai");

        }
    }
}

function typeServiceValidCheck(serInput,rowSerVal) {
    var checkTypeService = false;
    serInput = serInput.toLowerCase();
    serInput = serInput.substring(0, 1).toUpperCase() + serInput.substring(1);
    while (checkTypeService === false) {
        switch (serInput) {
            case "Villa":
            case  "House":
            case  "Room":
                arrListCustomers[rowSerVal][8] = serInput;
                checkTypeService = true;
                break;
            default:
                serInput = prompt("Loai Khach Hang Khong Hop Le \nXin Nhap Lai");
        }
    }
}

function typeRoomValidCheck(roomInput,rowRoVal) {
    var checkTypeRoom = false;
    roomInput = roomInput.toLowerCase();
    while (checkTypeRoom === false) {
        switch (roomInput) {
            case "business":
            case "normal":
                roomInput = roomInput.substring(0, 1).toUpperCase() + roomInput.substring(1);
                arrListCustomers[rowRoVal][9] = roomInput;
                checkTypeRoom = true;
                break;
            case "vip":
                roomInput = roomInput.toUpperCase()
                arrListCustomers[rowRoVal][9] = roomInput;
                checkTypeRoom = true;
                break;
            default:
                roomInput = prompt("Loai Phong Khong Hop Le \nXin Nhap Lai");
                break;
        }
    }
}

function calculateDiscountAndPrice(customerArrayRowVal) {
    var discountAdd = 0;
    var discountRent = 0;
    var discountTypeCus = 0;
    var priceService = 0;

    if (arrListCustomers[customerArrayRowVal][4] === 'Da Nang') {
        discountAdd = 20;
    } else if (arrListCustomers[customerArrayRowVal][4] === 'Hue') {
        discountAdd = 10;
    } else if (arrListCustomers[customerArrayRowVal][4] === 'Quang Nam') {
        discountAdd = 5;
    }

    if (arrListCustomers[customerArrayRowVal][7] > 7) {
        discountRent = 30;
    } else if (arrListCustomers[customerArrayRowVal][7] >= 5) {
        discountRent = 20;
    } else if (arrListCustomers[customerArrayRowVal][7] >= 2) {
        discountRent = 10;
    }

    if (arrListCustomers[customerArrayRowVal][5] === 'Diamond') {
        discountTypeCus = 15;
    }
    if (arrListCustomers[customerArrayRowVal][5] === 'Platium') {
        discountTypeCus = 10;
    }
    if (arrListCustomers[customerArrayRowVal][5] === 'Gold') {
        discountTypeCus = 5;
    }
    if (arrListCustomers[customerArrayRowVal][5] === 'Silver') {
        discountTypeCus = 5;
    }

    if (arrListCustomers[customerArrayRowVal][8] === 'Villa') {
        priceService = 500;
    }
    if (arrListCustomers[customerArrayRowVal][8] === 'House') {
        priceService = 300;
    }
    if (arrListCustomers[customerArrayRowVal][8] === 'Room') {
        priceService = 100;
    }
    var discountTotal = discountTypeCus  + discountRent  + discountAdd ;
    arrListCustomers[customerArrayRowVal][10] = discountTotal;
    arrListCustomers[customerArrayRowVal][11] = priceService * arrListCustomers[customerArrayRowVal][7] - discountTotal;
}

function displayAllCustomerInfor() {
    for (let i = 0; i < arrListCustomers.length; i++) {
       alert(displayInfor(i));
    }
}

function searchCustomerByName(searchName) {
    for (let j = 0; j < arrListCustomers.length; j++) {
        if (arrListCustomers[j].indexOf(searchName) !== -1) {
            return j;
        } else if ( j === arrListCustomers.length -1){
            return -1;
        }
    }
}

function displayInfor(rowVal) {
   return ("1:Ho Va Ten :" + arrListCustomers[rowVal][0] +
        "\n2:So CMND: " + arrListCustomers[rowVal][1] +
        "\n3:Ngay Sinh: " + arrListCustomers[rowVal][2] +
        "\n4:Email: " + arrListCustomers[rowVal][3] +
        "\n5:Dia Chi: " + arrListCustomers[rowVal][4] +
        "\n6:Loai Khach Hang: " + arrListCustomers[rowVal][5] +
        "\n7:So Luong Di Kem: " + arrListCustomers[rowVal][6] + "Nguoi" +
        "\n8:So Ngay Thue: " + arrListCustomers[rowVal][7] + "Ngay" +
        "\n9:Loai Dich Vu: " + arrListCustomers[rowVal][8] +
       "\n10:Loai Phong: " + arrListCustomers[rowVal][9] +
        "\n11:Giam Gia: " + arrListCustomers[rowVal][10] + "$" +
        "\n12:So Tien Thanh Toan Sau Giam Gia: " + arrListCustomers[rowVal][11] + "$");
}

function displayOneCustomerInfor(searchName) {
    let checkSearchName = searchCustomerByName(searchName);
        if (checkSearchName !== -1) {
          return  alert(displayInfor(checkSearchName));
        } else return  alert(" Khach Hang Ban Muon Hien Thi Khong Ton Tai");
    }

function displayOnlyNameCustomer() {
    var nameDisplay = "";
    for (var j = 0; j < arrListCustomers.length; j++) {
        nameDisplay += j + " " + arrListCustomers[j][0] + "\n";
    }
    return nameDisplay;
}

while (mainCheck === false) {
    var menuMainSelect = prompt("Main Menu:\n" +
        "1:Add New Customer.\n" +
        "2:Display Information Customer.\n" +
        "3:Edit Information Customer.\n" +
        "4.Delete Customer.\n " +
        "5.Exit");
    
    // noinspection FallThroughInSwitchStatementJS
    switch (menuMainSelect) {
        case "1":
            addNewCustomer();

        function addNewCustomer() {
            arrListCustomers.push(new Array(12));
            var nameCus = prompt("Nhap Ten").trim();
            nameCus = stringValid(nameCus);
            arrListCustomers[arrListCustomers.length - 1][0] = nameCus;

            var idNum = prompt("Nhap So CMND").trim();
            numberIntergerCheckValid(idNum);
            arrListCustomers[arrListCustomers.length - 1][1] = idNum;


            var dayOb = prompt("Nhap Ngay Thang Nam Sinh").trim();
            dayOb = monthDateCheckValid(dayOb);
            arrListCustomers[arrListCustomers.length - 1][2] = dayOb;

            var email = prompt("Nhap Dia Chi Email").trim();
            email = emailCheckValid(email);
            arrListCustomers[arrListCustomers.length - 1][3] = email;

            var address = prompt("Nhap Dia Chi").trim();
            address = stringValid(address);
            arrListCustomers[arrListCustomers.length - 1][4] = address;

            var customerType = prompt("Nhap Loai Khach Hang\n" +
                " 1.Diamond\n 2.Platinum\n 3.Gold\n 4.Silver\n 5.Member").trim();
            typeCustomerValidCheck(customerType, arrListCustomers.length - 1);

            var diKem = prompt("Nhap So Luong Di Kem").trim();
            diKem = numberIntergerCheckValid(diKem);
            arrListCustomers[arrListCustomers.length - 1][6] = diKem;

            var rentDays = prompt("Nhap So Ngay Thue").trim();
            rentDays = numberIntergerCheckValid(rentDays);
            arrListCustomers[arrListCustomers.length - 1][7] = rentDays;

            var typeService = prompt("Nhap Loai Dich Vu\n" +
                " 1.Villa = 500$ \n 2.House = 300$\n 3.Room = 100$").trim();
            typeServiceValidCheck(typeService, arrListCustomers.length - 1);

            var typeRoom = prompt("Nhap Loai Phong\n" +
                " 1.Vip\n 2.Business\n 3.Normal").trim();
            typeRoomValidCheck(typeRoom, arrListCustomers.length - 1);

            calculateDiscountAndPrice(arrListCustomers.length - 1);
            alert(displayInfor(arrListCustomers.length - 1));
        }
            break;
        case "2":
            displayCustomer();
        function displayCustomer() {
            let displayValCheck = false;
            while (displayValCheck === false) {
            let displayChoice = prompt("Chon Phuong Thuc Hien Thi\n" +
                "1: Toan Bo Khach Hang\n" +
                "2: Mot Khach Hang\n" +
                "3: Exit.").trim();

                switch (displayChoice) {
                    case "1":
                        displayAllCustomerInfor();
                        break;
                    case "2":
                        let nameSearch = prompt("Nhap Ten Khach Hang Can Hien Thi\n" + displayOnlyNameCustomer()).trim();
                        nameSearch = stringValid(nameSearch);
                        displayOneCustomerInfor(nameSearch);
                        break;
                    case "3":
                        displayValCheck = true;
                        break;
                    default:
                        displayChoice = prompt("Nhap Sai\n" +
                            "Chon Phuong Thuc Hien Thi\n" +
                            "1: Toan Bo Khach Hang\n" +
                            "2: Mot Khach Hang\n" +
                            "3. Exit").trim();
                        break;
}
}
}
        break;
        case "3":
            editCustomer();
        function editCustomer() {
            var editElement = prompt("Nhap Ten Khach Hang Can Hien Thi\n" + displayOnlyNameCustomer()).trim();
            editElement = stringValid(editElement);
            let i = searchCustomerByName(editElement);
            let editLoopCheck = false;
            if (i !== -1){
                while (editLoopCheck === false) {
                    var editNumChoice = prompt("Chon Gia Tri Ban Muon Sua Doi\n" +
                        "Nhap Exit De Hoan Thanh Va Xem Lai Thong Tin Sau Chinh Sua\n" + displayInfor(i));
                    switch (editNumChoice) {
                        case "1":
                            arrListCustomers[i][0] = prompt("Ho Va Ten Muon Thay Doi:").trim();
                            arrListCustomers[i][0] = stringValid(arrListCustomers[i][0]);
                            break;
                        case "2":
                            arrListCustomers[i][1] = prompt("So CMND Muon Thay Doi:").trim();
                            arrListCustomers[i][1] = numberIntergerCheckValid(arrListCustomers[i][1]);
                            break;
                        case "3":
                            arrListCustomers[i][2] = prompt("Ngay Thanh Nam Sinh Muon Thay Doi:").trim();
                            arrListCustomers[i][2] = monthDateCheckValid(arrListCustomers[i][2]);
                            break;
                        case "4":
                            arrListCustomers[i][3] = prompt("Email Muon Thay Doi:").trim();
                            arrListCustomers[i][3] = emailCheckValid(arrListCustomers[i][3]);
                            break;
                        case "5":
                            arrListCustomers[i][4] = prompt("Dia Chi Muon Thay Doi:").trim();
                            arrListCustomers[i][4] = stringValid(arrListCustomers[i][4]);
                            break;
                        case "6":
                            arrListCustomers[i][5] = prompt("Loai Khach Hang Muon Thay Doi:").trim();
                            typeCustomerValidCheck(arrListCustomers[i][5], i);
                            break;
                        case "7":
                            arrListCustomers[i][6] = prompt("So Luong Di Kem Muon Thay Doi:").trim();
                            arrListCustomers[i][6] = numberIntergerCheckValid(arrListCustomers[i][6]);
                            break;
                        case "8":
                            arrListCustomers[i][7] = prompt("So Ngay Thue Muon Thay Doi:").trim();
                            arrListCustomers[i][7] = numberIntergerCheckValid(arrListCustomers[i][7]);
                            break;
                        case "9":
                            arrListCustomers[i][8] = prompt("Loai Dich Vu Muon Thay Doi:").trim();
                            typeServiceValidCheck(arrListCustomers[i][8]);
                            break;
                        case "10":
                            arrListCustomers[i][9] = prompt("Loai Phong Muon Thay Doi:").trim();
                            typeRoomValidCheck(arrListCustomers[i][9]);
                            break;
                        case "11":
                        case "12":
                            alert("Gia Tri Khong The Thay Doi");
                            break;
                        case "Exit":
                            editLoopCheck = true;
                            break;
                        default:
                            alert("Xin Nhap Gia Tri La STT Hoac Exit");

                    }
                } alert(displayInfor(i));
                } else alert(" Khach Hang Ban Muon Hien Thi Khong Ton Tai");
            }


        case "4":
            deleteCustomer();
        function deleteCustomer() {
            let deleteName = prompt("Nhap Ten Khach Hang Ban Muon Xoa\n" + displayOnlyNameCustomer());
            deleteName = stringValid(deleteName);
            let deleteNum = searchCustomerByName(deleteName);
            if (deleteNum !== -1){
                arrListCustomers.splice(deleteNum, deleteNum);
                alert("Danh Sach Khach Hang\n" + displayOnlyNameCustomer());
            }else alert("Ten Ban Nhap Khong Ton Tai");
        }

            break;
        case "5":
        exit();
        function exit() {
        mainCheck = true;
        }
            break;
        default:
            menuMainSelect = prompt("Failed, Xin Chon Lai.\nMain Menu:\n" +
                "1:Add New Customer.\n" +
                "2:Display Information Customer.\n" +
                "3:Edit Information Customer.\n" +
                "4.Delete Customer.\n " +
                "5.Exit");
    }
}