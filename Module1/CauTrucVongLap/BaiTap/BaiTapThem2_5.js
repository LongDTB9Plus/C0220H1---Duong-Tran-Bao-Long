var tienVay = prompt("Nhap So Tien Vay")*1;
var thangVay = prompt("Nhap So Thang Vay")*1;
var laiSuat = promt("Nhap Lai Suat:")*1;
var tienLai = 0 ;

for (var i = 1; i < thangVay; i++){
    tienLai = tienVay*(laiSuat/100);
   tienVay = tienLai + tienVay;
}
document.write(eval(tienLai));
