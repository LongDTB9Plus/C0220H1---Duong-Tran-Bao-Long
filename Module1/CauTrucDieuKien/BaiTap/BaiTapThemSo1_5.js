var diemKiemTra = prompt("Nhap Diem Kiem Tra : ");
var diemGiuaKy = prompt("Nhap Diem Giua Ky : ");
var diemCuoiKy = prompt("Nhap Diem Cuoi Ky : ");
var diemTrungBinh = ((diemKiemTra*1 + diemGiuaKy*1 + diemCuoiKy*1) / 3);
if ( diemTrungBinh > 7.5 ) {
        document.write("Hoc Sinh Gioi");
}   else if( diemTrungBinh > 6.5 ) {
        document.write("Hoc Sinh Kha");
}   else  if( diemTrungBinh > 4.5 ) {
        document.write("Hoc Sinh Trung Binh");
}   else  if( diemTrungBinh > 3.5 ) {
        document.write("Hoc Sinh Yeu");
}   else  document.write("Hoc Sinh Kem");
