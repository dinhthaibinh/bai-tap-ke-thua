package com.binh.bai5;

public class DanhSachHoaDon {
	private KhachHang[] danhSach;
	private int count;
	
	public int setCount() {
		return count;
	}
	public void setCount (int count) {
		this.count = count;
	}
	
	public DanhSachHoaDon(int n) {
		this.danhSach = new KhachHang[100];
		this.count = 0;
	}
	
	public void themGiaoDich(int item) {
		switch (item) {
		case 1:
			danhSach[count] = new KhachHangVietNam();
			danhSach[count].nhapHoaDon();
			count ++;
			break;
		case 2:
		default:
			danhSach[count] = new KhachHangNuocNgoai();
			danhSach[count].nhapHoaDon();
			count ++;
			break;
		}
	}
	
	public boolean add(int item) {
		if (count >= 100) return false;
		themGiaoDich(item);
		return true;
	}
	
	public void hienThi() {
		for (int i = 0; i < count; i++) {
			danhSach[count].xuatHoaDon();	
		}
	}
	
	public long tinhTrungBinhHoaDonNguoiViet() {
		int tong = 0;
		int dem = 0;
		for (KhachHang khachHang : danhSach) {
			if (khachHang instanceof KhachHangVietNam) {
				tong += khachHang.thanhTien();
				dem ++;
			}
		}
		if (dem == 0) {
			return tong/dem;
		}
		return 0;
	}
	
	
}
