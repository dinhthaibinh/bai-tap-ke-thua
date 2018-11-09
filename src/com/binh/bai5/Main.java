package com.binh.bai5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("nhap vao so luong hoa don: ");
		int n = new Scanner(System.in).nextInt();
		DanhSachHoaDon ds = new DanhSachHoaDon(n);
		System.out.println("loai hoa don can thanh toan");
		System.out.println("1.hoa don viet nam");
		System.out.println("2.hoa don nuoc ngoai");
		int item = new Scanner(System.in).nextInt();
		for (int i = 0; i < n; i++) {
			ds.add(item);
		}
		ds.hienThi();
		System.out.println("hoa don trung binh nguoi viet" + ds.tinhTrungBinhHoaDonNguoiViet());
	}
}
