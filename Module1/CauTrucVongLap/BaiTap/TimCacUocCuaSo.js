var x = prompt("Nhap x");
var result = 0;

for ( var i = 0 ; i <= x ; i++){
    if ( x % i == '0' ){
        result += " " + i + " " ;
    }
}document.write(result);