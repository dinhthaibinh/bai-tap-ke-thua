package com.binh.bai10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ThongTinConNguoi tt = new ThongTinConNguoi();
		
		System.out.println("1.nhap thong tin sinh vien");
		System.out.println("2.nhap thong tin khach hang");
		System.out.println("3.nhap thong tin nhan vien");
		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			tt = new SinhVien();
			tt.nhap();
			tt.xuat();
			break;
		case 2:
			tt = new KhachHang();
			tt.nhap();
			tt.xuat();
			break;
		case 3:
			tt = new NhanVien();
			tt.nhap();
			tt.xuat();
			break;
		default:
			System.out.println("nhap 1 hoac 2 hoac 3");
			break;
		}
	}
}
