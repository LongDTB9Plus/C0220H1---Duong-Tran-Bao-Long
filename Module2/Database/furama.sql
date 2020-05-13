create database furama;
use furama;
create table Kieu_thue (
ID_kieu_thue int primary key not null,
Ten_kieu_thue varchar(45) not null,
Gia int not null
);

create table Loai_dich_vu (
ID_loai_dich_vu int primary key not null,
Ten_dich_vu varchar(45) not null
);

create table Dich_vu (
ID_dich_vu int primary key not null,
Ten_dich_vu varchar(45),
Dien_tich int not null,
So_tang int not null,
So_nguoi_toi_da varchar(45) not null,
Chi_phi_thue varchar(45) not null,
ID_kieu_thue int not null,
ID_loai_dich_vu int not null,
Trang_thai varchar(45),
foreign key (ID_kieu_thue) references Kieu_thue (ID_kieu_thue),
foreign key (ID_loai_dich_vu) references Loai_dich_vu (ID_loai_dich_vu)
);

create table Loai_khach (
ID_loai_khach int primary key not null,
Ten_loai_khach varchar(45)
);

create table Khach_hang (
ID_khach_hang int primary key not null,
ID_loai_khach int not null,
Ho_ten varchar(45) not null,
Ngay_sinh date not null,
So_CMND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45),
Dia_chi varchar(45),
foreign key (ID_loai_khach) references Loai_khach (ID_loai_khach)
);

create table Vi_tri (
ID_vi_tri int primary key not null,
Ten_vi_tri varchar(45) not null
);

create table Trinh_do (
ID_trinh_do int primary key not null,
Trinh_do varchar(45) not null
);

create table Bo_phan (
ID_bo_phan int primary key not null,
Ten_bo_phan varchar(45) not null
);

create table Nhan_vien (
ID_nhan_vien int primary key not null,
Ho_ten varchar(45) not null,
ID_vi_tri int not null,
ID_trinh_do int not null,
ID_bo_phan int not null,
Ngay_sinh date not null,
So_CMND varchar(45) not null,
Luong varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
Dia_chi varchar(45) not null,
foreign key (ID_vi_tri) references Vi_tri (ID_vi_tri),
foreign key (ID_trinh_do) references Trinh_do (ID_trinh_do),
foreign key (ID_bo_phan) references Bo_phan (ID_bo_phan)
);

create table Dich_vu_di_kem (
ID_dich_vu_di_kem int primary key not null,
Ten_dich_vu_di_kem varchar(45) not null,
Gia int not null,
Don_vi int not null,
Trang_thai_kha_dung varchar(45) not null
);

create table Hop_dong (
ID_hop_dong int primary key not null,
ID_nhan_vien int not null,
ID_khach_hang int not null,
ID_dich_vu int not null,
Ngay_lam_hop_dong date not null,
Ngay_ket_thuc date not null,
Tien_dat_coc int not null,
Tong_tien int not null,
foreign key (ID_nhan_vien) references Nhan_vien (ID_nhan_vien),
foreign key (ID_khach_hang) references Khach_hang (ID_khach_hang),
foreign key (ID_dich_vu) references Dich_vu (ID_dich_vu)
);

create table Hop_dong_chi_tiet (
ID_hop_dong_chi_tiet int primary key not null,
ID_hop_dong int not null,
ID_dich_vu_di_kem int not null,
So_luong int not null,
foreign key (ID_hop_dong) references Hop_dong (ID_hop_dong),
foreign key (ID_dich_vu_di_kem) references Dich_vu_di_kem (ID_dich_vu_di_kem)
);