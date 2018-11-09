package com.binh.bai8;

public class DanhSachHangHoa {
	private MatHangChung[] danhSach;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public DanhSachHangHoa() {
		danhSach = new MatHangChung[100];
		count = 0;
	}
	
	private void themHangHoa(int item) {
		switch (item) {
		case 1:
			danhSach[count] = new HangThucPham();
			danhSach[count].nhap();
			count++;
			break;
		case 2:
			danhSach[count] = new HangDienMay();
			danhSach[count].nhap();
			count++;
			break;
		default:
			danhSach[count] = new HangSu();
			danhSach[count].nhap();
			count++;
			break;
		}
	}
	
	public boolean add(int item) {
		if (count >= 100) {
			return false;
		}
		themHangHoa(item);
		return false;
	}
	
	public void hienThi() {
		for (int i = 0; i < count; i++) {
			danhSach[count].xuat();
		}
	}
}
