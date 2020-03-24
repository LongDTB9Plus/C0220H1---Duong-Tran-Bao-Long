class Customer {
    constructor(name,id,birthDay,email,address,typeCus,quantity,rentDays,typeSer,typeRoom) {
        this._name = name;
        this._id = id;
        this._birthDay = birthDay;
        this._email = email;
        this._address = address;
        this._typeCus = typeCus;
        this._quantity = quantity;
        this._rentDays = rentDays;
        this._typeSer = typeSer;
        this._typeRoom = typeRoom;
        this.discount = 0;
        this.price = 0;
    }

    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get birthDay() {
        return this._birthDay;
    }

    set birthDay(value) {
        this._birthDay = value;
    }

    get email() {
        return this._email;
    }

    set email(value) {
        this._email = value;
    }

    get address() {
        return this._address;
    }

    set address(value) {
        this._address = value;
    }

    get typeCus() {
        return this._typeCus;
    }

    set typeCus(value) {
        this._typeCus = value;
    }

    get quantity() {
        return this._quantity;
    }

    set quantity(value) {
        this._quantity = value;
    }

    get rentDays() {
        return this._rentDays;
    }

    set rentDays(value) {
        this._rentDays = value;
    }

    get typeSer() {
        return this._typeSer;
    }

    set typeSer(value) {
        this._typeSer = value;
    }

    get typeRoom() {
        return this._typeRoom;
    }

    set typeRoom(value) {
        this._typeRoom = value;
    }

    calculateDiscount(){
        let discountAdd = 0;
        let discountRent = 0;
        let discountTypeCus = 0;
        switch (this._address) {
            case "Da Nang":
                discountAdd = 20;
                break;
            case "Hue":
                discountAdd = 10;
                break;
            case "Quang Nam":
                discountAdd = 5;
                break;
        }
        if (this._rentDays > 7){
            discountRent = 30;
        }else if (this._rentDays >= 5){
            discountRent = 20;
        }else if (this._rentDays >=2){
            discountRent = 10;
        }

        switch (this._typeCus) {
            case "Diamond":
                discountTypeCus = 15;
                break;
            case "Platinum":
                discountTypeCus = 10;
                break;
            case "Gold":
                discountTypeCus = 5;
                break;
            case "Silver":
                discountTypeCus = 2;
                break;
        }
        return discountTypeCus + discountRent + discountAdd;
    }
    calculatePrice(){
        let priceSer = 0;
        switch (this._typeSer) {
            case "Villa":
                priceSer = 500;
                break;
            case "House":
                priceSer = 300;
                break;
            case "Room":
                priceSer = 100;
                break;
        }
        return (priceSer*this._rentDays - this.discount);
    }
}
class Employee{
    constructor(name,birthDay,id,phoneNumber,email,degree,position,office) {
        this.salary = 2000;
        this._name = name;
        this._birthDay = birthDay;
        this._id = id;
        this._phoneNumber = phoneNumber;
        this._email = email;
        this._degree = degree;
        this._position = position;
        this._office = office;
    }

    get office() {
        return this._office;
    }

    set office(value) {
        this._office = value;
    }

    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get birthDay() {
        return this._birthDay;
    }

    set birthDay(value) {
        this._birthDay = value;
    }

    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get phoneNumber() {
        return this._phoneNumber;
    }

    set phoneNumber(value) {
        this._phoneNumber = value;
    }

    get email() {
        return this._email;
    }

    set email(value) {
        this._email = value;
    }

    get degree() {
        return this._degree;
    }

    set degree(value) {
        this._degree = value;
    }

    get position() {
        return this._position;
    }

    set position(value) {
        this._position = value;
    }

    calculateSalary(){
    switch (this._office) {
        case "Manager":
            this.salary += 500;
            break;
        case "Sale":
            this.salary += 300;
            break;
        case "Marketing":
            this.salary += 200;
            break;
    }
    }
}

let listEmployees = [];
let listCustomers = [];
let loopMainMenu = false;


let isValidEmail = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]{3})$/;
let isValidBirthDay = /^[0-3]?[0-9]\/[01]?[0-9]\/[12][90][0-9][0-9]$/;
let isValidInteger = /^\d+$/;
let isValidID = /^\d{9}$/;

    function stringValid(stringIn) {
    stringIn = stringIn.toLowerCase();
    stringIn = stringIn.substring(0, 1).toUpperCase() + stringIn.substring(1);
    for (let i = 1; i < stringIn.length; i++) {
        if (stringIn.charAt(i) === " ") {
            stringIn = stringIn.substring(0, i) + stringIn.substring(i, i + 2).toUpperCase() + stringIn.substring(i + 2);
        }
    }
    return stringIn;
}
    function checkNumberIntegerValid(number) {
    let loop = false;
    while (loop === false) {
        if (isValidInteger.test(number)){
            loop = true;
        }else number = prompt("So Khong Hop Le\nNhap Lai So");
    }
    return number;
    }
    function checkBirthDay(monthDate) {
    let loop = false;
    while (loop === false){
        if (isValidBirthDay.test(monthDate)){
            loop = true;
        }else monthDate = prompt("Ngay Thang Nam Sinh Khong Hop Le\nNhap Lai");
    }
    return monthDate;
    }
    function checkEmailValid(email) {
        let loop = false;
        while (loop === false){
            if (isValidEmail.test(email)){
                loop = true;
            }else email = prompt("Dia Chi Email Khong Hop Le\nNhap Lai");
        }
        return email;
    }
    function checkID(idNum) {
        let loop = false;
        while (loop === false){
            if (isValidID.test(idNum)){
                loop = true;
            }else idNum = prompt("So CMND Khong Hop Le\nNhap Lai");
        }
        return idNum;
    }
    function checkTypeCustomerValid(cusInput) {
    cusInput = stringValid(cusInput);
    let loop = false;
    while (loop === false) {
        switch (cusInput) {
            case "Diamond":
            case "Platinum":
            case "Gold":
            case "Silver":
            case "Member":
                loop = true;
                break;
            default:
                cusInput = prompt("Loai Khach Hang Khong Hop Le \nXin Nhap Lai");

        }
    }
    return cusInput;
}
    function checkTypeServiceValid(serInput) {
    let loop = false;
   serInput = stringValid(serInput);
    while (loop === false) {
        switch (serInput) {
            case "Villa":
            case  "House":
            case  "Room":
                loop = true;
                break;
            default:
                serInput = prompt("Loai Khach Hang Khong Hop Le \nXin Nhap Lai");
        }
    }
    return serInput;
}
    function checkTypeRoomValid(roomInput) {
    let loop = false;
    roomInput = stringValid(roomInput);
    while (loop === false) {
        switch (roomInput) {
            case "Business":
            case "Normal":
            case "Vip":
                loop = true;
                break;
            default:
                roomInput = prompt("Loai Phong Khong Hop Le \nXin Nhap Lai");
                break;
        }
    }
    return roomInput;
}
    function findByName(choice,name) {
        switch (choice) {
            case 1:
                return  listCustomers.findIndex(x=>x.name === name);
            case 2:
                return  listEmployees.findIndex(x=>x.name === name);
        }

}
    function displayCustomerInformationPattern(position) {
    return ("1:Ho Va Ten :" + listCustomers[position]._name +
        "\n2:So CMND: " + listCustomers[position]._id +
        "\n3:Ngay Sinh: " + listCustomers[position]._birthDay +
        "\n4:Email: " + listCustomers[position]._email +
        "\n5:Dia Chi: " + listCustomers[position]._address +
        "\n6:Loai Khach Hang: " + listCustomers[position]._typeCus +
        "\n7:So Luong Di Kem: " + listCustomers[position]._quantity + "Nguoi" +
        "\n8:So Ngay Thue: " + listCustomers[position]._rentDays + "Ngay" +
        "\n9:Loai Dich Vu: " + listCustomers[position]._typeSer +
        "\n10:Loai Phong: " + listCustomers[position]._typeRoom +
        "\n11:Giam Gia: " + listCustomers[position].discount + "$" +
        "\n12:So Tien Thanh Toan Sau Giam Gia: " + listCustomers[position].price+ "$");
}
    function displayOnlyNameCustomer() {
let displayName ="";
    for( let i = 0; i<listCustomers.length;i++ ) {
        displayName += i + " " + listCustomers[i]._name + "\n";
    }
    return displayName;
}
    function addNewCustomer() {
listCustomers.push(new Customer());
let i = listCustomers.length - 1;
listCustomers[i]._name = stringValid(prompt("Nhap Ten Khach Hang"));
listCustomers[i]._id = checkID(prompt("Nhap So CMND"));
listCustomers[i]._birthDay = checkBirthDay(prompt("Nhap Ngay Thang Nam Sinh"));
listCustomers[i]._email = checkEmailValid(prompt("Nhap Dia Chi Email"));
listCustomers[i]._address = stringValid(prompt("Nhap Dia Chi"));
listCustomers[i]._typeCus = checkTypeCustomerValid(prompt("Nhap Loai Khach Hang"));
listCustomers[i]._quantity = checkNumberIntegerValid(prompt("Nhap So Nguoi")*1);
listCustomers[i]._rentDays = checkNumberIntegerValid(prompt("Nhap So Ngay Thue")*1);
listCustomers[i]._typeSer = checkTypeServiceValid(prompt("Nhap Loai Dich Vu"));
listCustomers[i]._typeRoom = checkTypeRoomValid(prompt("Nhap Loai Phong"));
listCustomers[i].discount = listCustomers[i].calculateDiscount();
listCustomers[i].price = listCustomers[i].calculatePrice();
alert(displayCustomerInformationPattern(i));
}
    function editInformation() {
    let loopEdit = false;
    let searchEdit = prompt("Nhap Ten Khach Hang Muon Hien Thi Tong So Tien Thanh Toan\n" + displayOnlyNameCustomer());
    if (findByName(1,searchEdit) !== -1) {
        let i = findByName(1,searchEdit);
        while (loopEdit === false) {
            let editChoice = prompt("Nhap So Thu Tu Cua Gia Tri Ban Muon Sua Doi\n" + displayCustomerInformationPattern(i));
            switch (editChoice) {
                case "1":
                    listCustomers[i]._name = stringValid(prompt("Ho Va Ten Muon Thay Doi"));
                    break;
                case "2":
                    listCustomers[i]._id = checkID(prompt("So CMND Muon Thay Doi"));
                    break;
                case "3":
                    listCustomers[i]._birthDay = checkBirthDay(prompt("Ngay Thang Nam Sinh Muon Thay Doi"));
                    break;
                case "4":
                    listCustomers[i]._email = checkEmailValid(prompt("Email Muon Thay Doi"));
                    break;
                case "5":
                    listCustomers[i]._address = stringValid("Dia Chi Muon Thay Doi");
                    break;
                case "6":
                    listCustomers[i]._typeCus = checkTypeCustomerValid(prompt("Loai Khach Hang Muon Thay Doi"));
                    break;
                case "7":
                    listCustomers[i]._quantity = checkNumberIntegerValid(prompt("So Nguoi Muon Thay Doi"));
                    break;
                case "8":
                    listCustomers[i]._rentDays = checkNumberIntegerValid(prompt("So Ngay Thue Muon Thay Doi"));
                    break;
                case "9":
                    listCustomers[i]._typeSer = checkTypeServiceValid(prompt("Loai Dich Vu Muon Thay Doi"));
                    break;
                case "10":
                    listCustomers[i]._typeRoom = checkTypeRoomValid(prompt("Loai Phong Muon Thay Doi"));
                    break;
                case "11":
                case "12":
                    alert("Gia Tri Nay Khong The Thay Doi");
                    break;
                case "Exit":
                    loopEdit = true;
                    break;
                default:
                    alert("Xin Nhap Gia Tri La STT Hoac Exit");

            }
        }alert(displayCustomerInformationPattern(i));
    }else alert(" Khach Hang Ban Muon Hien Thi Khong Ton Tai");
}
    function deleteCustomer() {
    let deleteName = stringValid(prompt("Nhap Ten Khach Hang Ban Muon Xoa\n" + displayOnlyNameCustomer()));
    let deleteIndex = findByName(1,deleteName);
    if ( deleteIndex !== -1){
        listCustomers.splice(deleteIndex,deleteIndex);
        alert("Danh Sach Khach Hang\n" + displayOnlyNameCustomer());
    }else alert("Khach Hang Khong Ton Tai");
}
    function searchTotalPay() {
    let searchToTalPay = stringValid(prompt("Nhap Ten Khach Hang Muon Hien Thi Tong So Tien Thanh Toan\n" + displayOnlyNameCustomer()));
    if (findByName(1,searchToTalPay) !== -1){
        alert("Tong So Tien Phai Thanh Toan:\n" + listCustomers[findByName(1,searchToTalPay)].price );
    }else alert("Khach Hang Ban Muon Tim Khong Ton Tai");
}
    function displayInformationCustomer() {
    let searchInformation = stringValid(prompt("Nhap Ten Khach Hang Muon Hien Thi Thong Tin\n" + displayOnlyNameCustomer()));
    if (findByName(1,searchInformation) !== -1){
        alert(displayCustomerInformationPattern(findByName(1,searchInformation)));
    }else alert("Khach Hang Ban Muon Tim Khong Ton Tai");
}
    function checkDegreeValid(degree) {
    let loop = false;
    while (loop === false) {
        switch (stringValid(degree)) {
            case "Trung Cap":
            case "Cao Dang":
            case "Dai Hoc":
            case "Sau Dai Hoc":
                loop = true;
                break;
            default:
                degree = prompt("Nhap Sai");
        }
    }
    return degree;
}
    function checkPositionValid(position) {
let loop = false;
while (loop === false){
    switch (stringValid(position)) {
        case "Le Tan":
        case "Phuc Vu":
        case "Chuyen Vien":
        case "Giam Sat":
        case "Quan Ly":
        case "Giam Doc":
            loop = true;
            break;
        default:
            position = prompt("Nhap Sai");

    }
}
return position;
}
    function checkOfficeValid(office) {
let loop = false;
while (loop === false){
    switch (stringValid(office)) {
        case "Sale":
        case "Marketing":
        case "Manager":
        case "Administrative":
        case "Service":
            loop = true;
            break;
        default:
            office = prompt("Nhap Sai");
    }
}
return office;
}
    function displayEmployerInformationPattern(position) {
return ("1:Ho Va Ten :" + listEmployees[position]._name +
    "\n2:So CMND: " + listEmployees[position]._id +
    "\n3:Ngay Sinh: " + listEmployees[position]._birthDay +
    "\n4:Email: " + listEmployees[position]._email +
    "\n5:So Dien Thoai: " + listEmployees[position]._phoneNumber +
    "\n6:Trinh Do Hoc Van: " + listEmployees[position]._degree +
    "\n7:Vi Tri Cong Tac: " + listEmployees[position]._position +
    "\n8:Bo Phan Lam Viec: " + listEmployees[position]._office +
    "\n9:Muc Luong: " + listEmployees[position].salary + "$" );
}
    function addNewEmployer() {
listEmployees.push(new Employee());
let i = listEmployees.length - 1;
listEmployees[i]._name = stringValid(prompt("Nhap Ten Nhan Vien"));
    listEmployees[i]._birthDay = checkBirthDay(prompt("Nhap Ngay Thang Nam Sinh"));
    listEmployees[i]._id = checkID(prompt("Nhap So CMND"));
    listEmployees[i]._phoneNumber = checkNumberIntegerValid(prompt("Nhap So Dien Thoai"));
    listEmployees[i]._email = checkEmailValid(prompt("Nhap Dia Chi Email"));
    listEmployees[i]._degree = checkDegreeValid(prompt("Nhap Trinh Do Hoc Van"));
    listEmployees[i]._position = checkPositionValid(prompt("Nhap Vi Tri Lam Viec"));
    listEmployees[i]._office = checkOfficeValid(prompt("Nhap Bo Phan Lam Viec"));
    listEmployees[i].salary = listEmployees[i].calculateSalary();
    alert(displayEmployerInformationPattern(i));
}
    function displayOnlyNameEmployer() {
    let displayName ="";
    for( let i = 0; i < listEmployees.length;i++ ) {
        displayName += i + " " + listEmployees[i]._name + "\n";
    }
    return displayName;
}
    function displayEmployerSalary() {
let searchEmployerSalary = stringValid(prompt("Nhap Ten Nhan Vien Muon Tim" + displayOnlyNameEmployer()));
if(findByName(2,searchEmployerSalary) !== -1){
    alert("Muc Luong:" + listEmployees[findByName(2,searchEmployerSalary)].salary);
}else alert("Nhan Vien Ban Tim Khong Ton Tai");
}
    function displayEmployerInformation() {
let searchEmployer = stringValid("Nhap Ten Nhan Vien Muon Tim" + displayOnlyNameEmployer());
if (findByName(2,searchEmployer) !== -1){
    alert(displayEmployerInformationPattern(findByName(2,searchEmployer)));
}else alert("Nhan Vien Ban Muon Tim Khong Ton Tai");
}

while (loopMainMenu === false) {
        let selectMainMenu = prompt("Main Menu\n"+
        "1: Customer Menu.\n" +
        "2: Employer Menu.\n" +
        "3: Exit.");
        if (selectMainMenu === "1") {
            let loopMainMenuCustomer = false;
            while (loopMainMenuCustomer === false) {
                let selectMainMenuCustomer = prompt("Main Menu:\n" +
                    "1:Add New Customer.\n" +
                    "2:Display Information Customer.\n" +
                    "3:Display Total Pay Of Customer.\n" +
                    "4:Edit Information Customer.\n" +
                    "5.Delete Customer.\n " +
                    "6.Exit");
                switch (selectMainMenuCustomer) {
                    case "1":
                        addNewCustomer();
                        break;
                    case "2":
                        displayInformationCustomer();
                        break;
                    case "3":
                        searchTotalPay();
                        break;
                    case "4":
                        editInformation();
                        break;
                    case "5":
                        deleteCustomer();
                        break;
                    case "6":
                        loopMainMenuCustomer = true;
                        break;
                    default:
                        selectMainMenuCustomer = prompt("Failed, Xin Chon Lai \nMain Menu:\n" +
                            "1:Add New Customer.\n" +
                            "2:Display Information Customer.\n" +
                            "3:Display Total Pay Of Customer.\n" +
                            "4:Edit Information Customer.\n" +
                            "5.Delete Customer.\n " +
                            "6.Exit");
                }
            }
        }else if ( selectMainMenu === "2"){
            let loopMainMenuEmployer = false;
            while (loopMainMenuEmployer === false){
                let selectMainMenuEmployer = prompt("Main Menu:\n"+
                "1:Add new Employer\n"+
                "2:Display Employer Information\n"+
                "3:Display Salary Of Employer\n"+
                "4:Exit");
                switch (selectMainMenuEmployer) {
                    case "1":
                        addNewEmployer();
                        break;
                    case "2":
                        displayEmployerInformation();
                        break;
                    case "3":
                        displayEmployerSalary();
                        break;
                    case "4":
                        loopMainMenuEmployer = true;
                        break;
                    default:
                        selectMainMenuEmployer = prompt("Failed \nMain Menu:\n"+
                            "1:Add new Employer\n"+
                            "2:Display Employer Information\n"+
                            "3:Display Salary Of Employer\n"+
                            "4:Exit");

                }
            }
        }

}