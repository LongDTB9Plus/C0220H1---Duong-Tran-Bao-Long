var tienVay = prompt("Nhap So Tien Vay");
var thangVay = prompt("Nhap So Thang Vay");
var tienLai = 0 ;

for (var i = 1; i < thangVay; i++){
    tienLai = tienVay*1.5/100;
   tienVay = tienLai + eval(tienVay);
}
document.write(eval(tienLai));
