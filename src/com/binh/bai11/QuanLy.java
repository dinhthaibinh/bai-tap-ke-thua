package com.binh.bai11;

public class QuanLy {
	private SinhVien[] danhSach;
	private int count;
	
	public SinhVien[] getDanhSach() {
		return danhSach;
	}
	public void setDanhSach(SinhVien[] danhSach) {
		this.danhSach = danhSach;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public QuanLy () {
		danhSach = new SinhVien[100];
		this.count = 0;
	}
	
	public void themSinhVien(int item) {
		switch (item) {
		case 1:
			danhSach[count] = new SinhVienTrungCap();
			danhSach[count].nhap();
			break;
		case 2:
			danhSach[count] = new SinhVienCaoDang();
			danhSach[count].nhap();
			break;
		case 3:
			danhSach[count] = new SinhVienDaiHoc();
			danhSach[count].nhap();
			break;
		default:
			break;
		}
	}
	
	public boolean add(int item) {
		if(count >=100) {
			return false;
		}themSinhVien(item);
		return true;
	}
	
	public void hienThi() {
		for (int i = 0; i < count; i++) {
			danhSach[count].xuat();	
		}
	}
}
