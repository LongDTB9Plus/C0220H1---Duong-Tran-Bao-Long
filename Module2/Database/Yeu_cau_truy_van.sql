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

select hop_dong.ID_khach_hang, Khach_hang.Ho_ten, loai_khach.Ten_loai_khach, hop_dong.ID_hop_dong, hop_dong.Ngay_lam_hop_dong, hop_dong.Ngay_ket_thuc, Dich_vu.Ten_dich_vu, (dich_vu.Chi_phi_thue + hop_dong_chi_tiet.So_luong * (dich_vu_di_kem.gia*1000)) as Tong_tien
from  hop_dong
left join khach_hang
on (hop_dong.ID_khach_hang = khach_hang.ID_khach_hang)
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