var a = prompt("Nhap So :")*1;
var result = true;
function check(num) {
    if (num === 0){
        alert("So Nhap Vao La 0");
    }
    else if(num < 0){
    result = false;
    alert(result);
}else {alert(result)}
}
check(a);



