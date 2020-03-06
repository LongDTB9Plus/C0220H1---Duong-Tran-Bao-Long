var a = prompt("Nhap Do Dai Canh a:");
var b = prompt("Nhap Do Dai Canh b:");
var c = prompt("Nhap Do Dai Canh c:");

if ((a > 0) && (b > 0) && (c > 0) && ( a + b > c) && ( b + c > a ) && ( a + c > b )) {
    alert( a +" " + b + " " + c + " " + " La Canh Cua Tam Giac" );
}else alert( a +" " + b + " " + c + " " + " Khong Phai Canh Cua Tam Giac" );