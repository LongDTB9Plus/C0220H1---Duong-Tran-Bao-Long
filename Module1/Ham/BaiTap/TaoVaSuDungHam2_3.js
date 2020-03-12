var a = prompt("So Can Tinh:")*1;
var result = 1;

function tinhGiaiThua(num) {
    for (var i = 1;i <= num;i++){
        result = result*i;
    }document.write(result);
}

tinhGiaiThua(a);
