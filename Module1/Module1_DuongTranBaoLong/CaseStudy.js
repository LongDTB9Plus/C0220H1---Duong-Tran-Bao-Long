var nameCus = document.getElementById("nameCustomer");
var idNum = document.getElementById("idNum");
var dayOb = document.getElementById("dateOb");
var email = document.getElementById("email");
var address = document.getElementById("address");
var customerType = document.getElementById("customerType");
var disct = document.getElementById("disct");
var diKem = document.getElementById("diKem");
var rentDays = document.getElementById("rentDays");
var typeService = document.getElementById("typeService");
var typeRoom = document.getElementById("typeRoom");


function priceLook() {
    var bill = typeService.value * rentDays.value * (1 - (disct.value)/100);
    document.write("Name: " + nameCus.value);
    document.write("ID Number: " + idNum.value);
    document.write("Date Of Birth: " + dayOb.value);
    document.write("Email: " + email.value);
    document.write("Address: " + address.value);
    document.write("Customer Type: " + customerType.value);
    document.write("Discount: " + disct.value);
    document.write("Di Kem: " + diKem.value);
    document.write("Rent Day: " + rentDays.value);
    document.write("Type of Services: " + typeService.value);
    document.write("Type Of Room: " + typeRoom.value);
    document.write("Price:" + bill);

}