use furama;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT * FROM furama.nhan_vien
where ((char_length(Ho_ten)) < 15)
and ((Ho_ten like 'H%') 
or (Ho_ten like 'T%') 
or (Ho_ten like 'K%')) ;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
 select * from furama.khach_hang
 where (round((datediff(curdate() , Ngay_sinh) / 365)) >= 18)
 and (round((datediff(curdate() , Ngay_sinh) / 365)) <= 50)
 and (Dia_chi = 'Da Nang') or (Dia_chi = 'Quang Tri');
 
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. 

select khach_hang.Ho_ten, count(hop_dong.ID_khach_hang) as Luot_Dat_Phong
from khach_hang 
left join hop_dong
on (khach_hang.ID_khach_hang = hop_dong.ID_khach_hang) 
left join loai_khach
on (khach_hang.ID_loai_khach = loai_khach.ID_loai_khach)
where (loai_khach.Ten_loai_khach = 'Diamond')
group by
khach_hang.ID_khach_hang
order by Luot_Dat_Phong asc;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 

select khach_hang.ID_khach_hang, Khach_hang.Ho_ten, loai_khach.Ten_loai_khach, hop_dong.ID_hop_dong, hop_dong.Ngay_lam_hop_dong, hop_dong.Ngay_ket_thuc, Dich_vu.Ten_dich_vu,
dich_vu.Chi_phi_thue + sum(hop_dong_chi_tiet.So_luong * (dich_vu_di_kem.gia*1000))  as Tong_tien
from  khach_hang
left join hop_dong
on (khach_hang.ID_khach_hang = hop_dong.ID_khach_hang )
left join dich_vu
on (hop_dong.ID_dich_vu = dich_vu.ID_dich_vu)
left join loai_khach
on (khach_hang.ID_loai_khach = loai_khach.ID_loai_khach)
left join hop_dong_chi_tiet
on (hop_dong.ID_hop_dong = hop_dong_chi_tiet.ID_hop_dong)
left join dich_vu_di_kem
on (hop_dong_chi_tiet.ID_dich_vu_di_kem = dich_vu_di_kem.ID_dich_vu_di_kem)
group by hop_dong.ID_hop_dong
order by hop_dong.ID_hop_dong asc;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
--  của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select Dich_vu.ID_dich_vu, Dich_vu.Ten_dich_vu, Dich_vu.Dien_tich, Dich_vu.Chi_phi_thue, Loai_dich_vu.Ten_dich_vu ,ngay_lam_hop_dong
from Dich_vu
inner join Loai_dich_vu
on (Dich_vu.ID_loai_dich_vu = Loai_dich_vu.ID_loai_dich_vu)
left join hop_dong
on (Dich_vu.ID_dich_vu = hop_dong.ID_dich_vu)
group by Dich_vu.ID_dich_vu
having (max(year(hop_dong.ngay_lam_hop_dong)) < 2019) or (hop_dong.ngay_lam_hop_dong is null)
order by Dich_vu.ID_dich_vu asc;

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019. 

select Dich_vu.ID_dich_vu, Dich_vu.Ten_dich_vu, Dich_vu.Dien_tich, Dich_vu.Chi_phi_thue, Loai_dich_vu.Ten_dich_vu 
from Dich_vu
inner join Loai_dich_vu
on (Dich_vu.ID_loai_dich_vu = Loai_dich_vu.ID_loai_dich_vu)
left join hop_dong
on (Dich_vu.ID_dich_vu = hop_dong.ID_dich_vu)
group by Dich_vu.ID_dich_vu
having (max(year(hop_dong.ngay_lam_hop_dong)) <= 2019)
order by Dich_vu.ID_dich_vu asc;

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- Cach 1: su dung distinct
select distinct Ho_ten from khach_hang; 

-- Cach 2: su dung group by

select Ho_ten from khach_hang
group by Ho_ten; 

-- Cach 3: su dung UNION
select Ho_ten from khach_hang
union
select Ho_ten from khach_hang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng 
-- thực hiện đặt phòng. 

 select count(case  
 when (month(ngay_lam_hop_dong) = 1) then 1 else null end) as Thang_1,
 count(case  
 when (month(ngay_lam_hop_dong) = 2) then 1 else null end) as Thang_2,
sum(case  
when (month(ngay_lam_hop_dong) = 3) then 1 else null end) as Thang_3,
count(case  
when (month(ngay_lam_hop_dong) = 4) then 1 else null end) as Thang_4,
count(case  
when (month(ngay_lam_hop_dong) = 5) then 1 else null end) as Thang_5,
count(case  
when (month(ngay_lam_hop_dong) = 6) then 1 else null end) as Thang_6,
count(case  
when (month(ngay_lam_hop_dong) = 7) then 1 else null end) as Thang_7,
count(case  
when (month(ngay_lam_hop_dong) = 8) then 1 else null end) as Thang_8,
count(case  
when (month(ngay_lam_hop_dong) = 9) then 1 else null end) as Thang_9,
count(case  
when (month(ngay_lam_hop_dong) = 10) then 1 else null end) as Thang_10,
count(case  
when (month(ngay_lam_hop_dong) = 11) then 1 else null end) as Thang_11,
count(case  
when (month(ngay_lam_hop_dong) = 12) then 1 else null end) as Thang_12
 from hop_dong
 where year(ngay_lam_hop_dong) = 2019;
 
 select month(ngay_lam_hop_dong) as Thang,count(ngay_lam_hop_dong) as Luot_Dat_Phong from hop_dong
 where (month(ngay_lam_hop_dong) between 1 and 12) and year(ngay_lam_hop_dong) = 2019
 group by ngay_lam_hop_dong;
 
 -- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
 -- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
 -- (được tính dựa trên việc count các IDHopDongChiTiet).
 
 select hop_dong_chi_tiet.ID_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.Tien_dat_coc, sum(hop_dong_chi_tiet.so_luong) as So_Lan_Su_Dung_Dich_Vu, count(hop_dong_chi_tiet.ID_dich_vu_di_kem) as So_Loai_Dich_Vu 
 from hop_dong_chi_tiet
 inner join hop_dong
 on hop_dong_chi_tiet.ID_hop_dong = hop_dong.ID_hop_dong
 group by hop_dong_chi_tiet.ID_hop_dong
 order by hop_dong_chi_tiet.ID_hop_dong asc;
 
 -- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
 -- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”. 
 
 select khach_hang.Ho_ten,khach_hang.Dia_chi,hop_dong_chi_tiet.ID_dich_vu_di_kem, hop_dong_chi_tiet.so_luong
 from hop_dong_chi_tiet
 inner join hop_dong
 on hop_dong_chi_tiet.ID_hop_dong = hop_dong.ID_hop_dong
 inner join khach_hang
 on hop_dong.ID_khach_hang = khach_hang.ID_khach_hang
 where khach_hang.Dia_chi = 'Da Nang' or khach_hang.Dia_chi = 'Quang Tri'
 order by khach_hang.Ho_ten asc;
 
 -- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, 
--  SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ 
 -- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
 
 select hop_dong.ID_hop_dong, nhan_vien.Ho_ten as 'Ten Nhan Vien', khach_hang.Ho_ten as 'Ten Khach Hang', khach_hang.SDT,dich_vu.Ten_dich_vu, sum(hop_dong_chi_tiet.so_luong) as 'So Dich Vu Di Kem Su Dung',hop_dong.Tien_dat_coc
 from hop_dong
 inner join nhan_vien
 on hop_dong.ID_nhan_vien = nhan_vien.ID_nhan_vien
 inner join khach_hang
 on hop_dong.ID_khach_hang = khach_hang.ID_khach_hang
 inner join dich_vu
 on hop_dong.ID_dich_vu = dich_vu.ID_dich_vu
 inner join hop_dong_chi_tiet
 on hop_dong.ID_hop_dong = hop_dong_chi_tiet.ID_hop_dong
 where (month(hop_dong.ngay_lam_hop_dong) between 10 and 12) and (year(hop_dong.ngay_lam_hop_dong) = 2019)
 and (month(hop_dong.ngay_lam_hop_dong) not between 1 and 6) 
 order by hop_dong.ID_hop_dong asc;
 
 -- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
 -- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau). 

 select ID,Dich_Vu_Di_Kem,max(So_Lan_Su_Dung) as maxSL from 
 (select ID,Dich_Vu_Di_Kem,max(So_Lan) So_Lan_Su_Dung
 from 
 ( select
		dich_vu_di_kem.ID_dich_vu_di_kem as ID,dich_vu_di_kem.Ten_dich_vu_di_kem as Dich_Vu_Di_Kem,(sum(hop_dong_chi_tiet.so_luong)) as So_Lan
        from hop_dong_chi_tiet
        inner join dich_vu_di_kem
        on dich_vu_di_kem.ID_dich_vu_di_kem = hop_dong_chi_tiet.ID_dich_vu_di_kem
        group by dich_vu_di_kem.ID_dich_vu_di_kem
        ) A
group by ID) B
inner join A
on maxSL = A.So_Lan
;
 
