function checkNumber(num) {
    var checkNum = true ;
    for ( var i =2; i < num; i++){
    if (num % i === 0){
    checkNum = false;
    break;
    }
    } if (checkNum === true){
        document.write(num + " La So Nguyen To.");
    }else document.write(num + " Khong Phai La So Nguyen To.");
}
var a = prompt("Nhap So Can Kiem Tra")*1;

checkNumber(a);