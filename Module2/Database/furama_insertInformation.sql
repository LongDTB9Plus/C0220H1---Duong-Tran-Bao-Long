SELECT * FROM furama.trinh_do;
INSERT INTO `furama`.`trinh_do` (`ID_trinh_do`, `Trinh_do`) VALUES ('1', 'Trung Cap');
INSERT INTO `furama`.`trinh_do` (`ID_trinh_do`, `Trinh_do`) VALUES ('2 ', 'Cao Dang');
INSERT INTO `furama`.`trinh_do` (`ID_trinh_do`, `Trinh_do`) VALUES ('3', 'Dai Hoc');
INSERT INTO `furama`.`trinh_do` (`ID_trinh_do`, `Trinh_do`) VALUES ('4', 'Sau Dai Hoc');
INSERT INTO `furama`.`trinh_do` (`ID_trinh_do`, `Trinh_do`) VALUES ('5', 'THPT');

select * From furama.vi_tri;
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('1', 'Giam Doc');
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('2', 'Truong Phong');
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('3', 'Le Tan');
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('4', 'Nhan Vien');
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('5', 'Buong Phong');
INSERT INTO `furama`.`vi_tri` (`ID_vi_tri`, `Ten_vi_tri`) VALUES ('6', 'Bao Ve');

SELECT * FROM furama.bo_phan;
INSERT INTO `furama`.`bo_phan` (`ID_bo_phan`, `Ten_bo_phan`) VALUES ('1 ', 'Hanh Chinh');
INSERT INTO `furama`.`bo_phan` (`ID_bo_phan`, `Ten_bo_phan`) VALUES ('2', 'Phuc Vu');
INSERT INTO `furama`.`bo_phan` (`ID_bo_phan`, `Ten_bo_phan`) VALUES ('3', 'Bao Ve');
INSERT INTO `furama`.`bo_phan` (`ID_bo_phan`, `Ten_bo_phan`) VALUES ('4', 'Kinh Doanh');

SELECT * FROM furama.nhan_vien;
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('1', 'Charmion Seares', '6', '5', '3', '1984-01-25', '502-08-3288', '6000000', '283-740-4137', 'cseares0@studiopress.com', '88 American Ash Drive');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('2', 'Timmie Gower', '3', '2', '2', '1983-01-05', '395-56-1419', '10000000', '538-587-8150', 'tgower1@networkadvertising.org', '5820 Nancy Alley');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('3', 'Sybille Kempe', '3', '2', '2', '1992-02-02', '342-09-8101', '10000000', '635-837-4354', 'skempe2@hostgator.com', '0 Dawn Place');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('4', 'Hanna Spensley', '1', '4', '1', '1990-03-12', '721-04-6072', '28000000', '945-412-6367', 'hspensley3@dedecms.com', '3004 Transport Drive');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('5', 'Ethelbert Hadigate', '4', '3', '1', '1995-11-25', '649-83-3463', '15000000', '692-730-4741', 'ehadigate4@economist.com', '1 Lyons Trail');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('6', 'Andrey Galbreath', '4', '3', '1', '1998-02-19', '537-12-4748', '16000000', '377-115-1435', 'agalbreath5@simplemachines.org', '221 Farragut Pass');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('7', 'Carena Hayen', '5', '5', '2', '1992-04-29', '517-64-5758', '9000000', '863-538-1849', 'chayen6@arizona.edu', '84 Forest Dale Road');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('8', 'Jaime Leeson', '2', '4', '1', '1984-10-22', '467-46-6727', '26000000', '367-620-8835', 'jleeson7@slashdot.org', '1225 Carey Street');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('9', 'Addia Phare', '2', '4', '1', '1986-10-02', '501-37-7152', '22000000', '344-986-0121', 'aphare8@cornell.edu', '82045 Melvin Parkway');
INSERT INTO `furama`.`nhan_vien` (`ID_nhan_vien`, `Ho_ten`, `ID_vi_tri`, `ID_trinh_do`, `ID_bo_phan`, `Ngay_sinh`, `So_CMND`, `Luong`, `SDT`, `Email`, `Dia_chi`) VALUES ('10', 'Mayne Hofer', '6', '1', '2', '1985-10-12', '649-27-1224', '8000000', '957-691-0535', 'mhofer9@tmall.com', '1280 Toban Lane');

SELECT * FROM furama.loai_khach;
INSERT INTO `furama`.`loai_khach` (`ID_loai_khach`, `Ten_loai_khach`) VALUES ('1', 'Diamond');
INSERT INTO `furama`.`loai_khach` (`ID_loai_khach`, `Ten_loai_khach`) VALUES ('2', 'Platium');
INSERT INTO `furama`.`loai_khach` (`ID_loai_khach`, `Ten_loai_khach`) VALUES ('3', 'Gold');
INSERT INTO `furama`.`loai_khach` (`ID_loai_khach`, `Ten_loai_khach`) VALUES ('4', 'Silver');
INSERT INTO `furama`.`loai_khach` (`ID_loai_khach`, `Ten_loai_khach`) VALUES ('5', 'Member');

SELECT * FROM furama.loai_dich_vu;
INSERT INTO `furama`.`loai_dich_vu` (`ID_loai_dich_vu`, `Ten_dich_vu`) VALUES ('1', 'Villa');
INSERT INTO `furama`.`loai_dich_vu` (`ID_loai_dich_vu`, `Ten_dich_vu`) VALUES ('2', 'House');
INSERT INTO `furama`.`loai_dich_vu` (`ID_loai_dich_vu`, `Ten_dich_vu`) VALUES ('3', 'Room');

SELECT * FROM furama.kieu_thue;
INSERT INTO `furama`.`kieu_thue` (`ID_kieu_thue`, `Ten_kieu_thue`, `Gia`) VALUES ('1', 'Theo Ngay', '100');
INSERT INTO `furama`.`kieu_thue` (`ID_kieu_thue`, `Ten_kieu_thue`, `Gia`) VALUES ('2', 'Theo Tuan', '600');
INSERT INTO `furama`.`kieu_thue` (`ID_kieu_thue`, `Ten_kieu_thue`, `Gia`) VALUES ('3', 'Theo Thang', '2000');

SELECT * FROM furama.dich_vu_di_kem;
INSERT INTO `furama`.`dich_vu_di_kem` (`ID_dich_vu_di_kem`, `Ten_dich_vu_di_kem`, `Gia`, `Don_vi`, `Trang_thai_kha_dung`) VALUES ('1', 'Massage', '2000', '1000', 'Co');
INSERT INTO `furama`.`dich_vu_di_kem` (`ID_dich_vu_di_kem`, `Ten_dich_vu_di_kem`, `Gia`, `Don_vi`, `Trang_thai_kha_dung`) VALUES ('2', 'Karaoke', '200', '1000', 'Co');
INSERT INTO `furama`.`dich_vu_di_kem` (`ID_dich_vu_di_kem`, `Ten_dich_vu_di_kem`, `Gia`, `Don_vi`, `Trang_thai_kha_dung`) VALUES ('3', 'Car', '200', '1000', 'Khong');
INSERT INTO `furama`.`dich_vu_di_kem` (`ID_dich_vu_di_kem`, `Ten_dich_vu_di_kem`, `Gia`, `Don_vi`, `Trang_thai_kha_dung`) VALUES ('4', 'Drink', '300', '1000', 'Co');

SELECT * FROM furama.dich_vu;
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('1', 'Villa Canh Bien', '200', '2', '4', '2000000', '3', '1', 'Co');
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('2', 'Villa VIP', '400', '3', '4', '5000000', '3', '1', 'Co');
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('3', 'House VIP', '300', '3', '4', '4000000', '2', '2', 'Co');
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('4', 'House Normal', '200', '2', '4', '1000000', '1', '2', 'Co');
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('5', 'Room VIP', '75', '1', '2', '1500000', '1', '3', 'Khong');
INSERT INTO `furama`.`dich_vu` (`ID_dich_vu`, `Ten_dich_vu`, `Dien_tich`, `So_tang`, `So_nguoi_toi_da`, `Chi_phi_thue`, `ID_kieu_thue`, `ID_loai_dich_vu`, `Trang_thai`) VALUES ('6', 'Room View Bien', '50', '1', '2', '1200000', '1', '3', 'Co');

SELECT * FROM furama.khach_hang;
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('1', '1', 'John Henry', '1988-07-21', '123-123-123', '123456789', 'abc@abc.com', 'Anh');
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('2', '2', 'Nguyen Van A', '1990-05-23', '333-333-333', '3333333333', 'vanA@gmail.com', 'Da Nang');
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('3', '3', 'Nguyen Thanh B', '1987-06-12', '444-444-444', '44444444444', 'tB@gmail.com', 'Quang Tri');
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('4', '4', 'Duong Thi C', '1993-04-12', '555-555-555', '5555555555555', 'DuongHue@gmail.com', 'Hue');
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('5', '5', 'Nguyen Tien Thanh', '1985-04-26', '777-777-7777', '777777777777', 'tienThanhHN@gmail.com', 'Ha Noi');
INSERT INTO `furama`.`khach_hang` (`ID_khach_hang`, `ID_loai_khach`, `Ho_ten`, `Ngay_sinh`, `So_CMND`, `SDT`, `Email`, `Dia_chi`) VALUES ('6', '1', 'Skadi', '1987-05-13', '777-777-777776', '45454545454', 'skadi@fgo.com', 'Da Nang');

SELECT * FROM furama.hop_dong;
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('1', '5', '1', '2', '2020-02-12', '2020-03-12', '2000000', '8000000');
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('2', '6', '2', '3', '2019-08-21', '2019-09-01', '3000000', '12000000');
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('3', '5', '3', '2', '2020-05-12', '2020-06-04', '1000000', '14000000');
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('4', '8', '4', '4', '2018-04-23', '2018-05-03', '1500000', '7000000');
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('5', '8', '5', '6', '2019-03-30', '2019-04-05', '4000000', '9000000');
INSERT INTO `furama`.`hop_dong` (`ID_hop_dong`, `ID_nhan_vien`, `ID_khach_hang`, `ID_dich_vu`, `Ngay_lam_hop_dong`, `Ngay_ket_thuc`, `Tien_dat_coc`, `Tong_tien`) VALUES ('6', '5', '6', '6', '2020-07-17', '2020-08-27', '3000000', '20000000');

SELECT * FROM furama.hop_dong_chi_tiet;
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('1', '1', '2', '2');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('2', '2', '3', '2');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('3', '3', '2', '2');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('4', '4', '2', '1');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('5', '5', '2', '3');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('6', '6', '2', '2');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('7', '6', '1', '1');
INSERT INTO `furama`.`hop_dong_chi_tiet` (`ID_hop_dong_chi_tiet`, `ID_hop_dong`, `ID_dich_vu_di_kem`, `So_luong`) VALUES ('8', '6', '4', '3');


