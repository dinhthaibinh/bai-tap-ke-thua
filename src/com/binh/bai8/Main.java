package com.binh.bai8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DanhSachHangHoa ds = new DanhSachHangHoa();
		System.out.println("nhap vao danh sach ban muon them: ");
		System.out.println("1.hang thuc pham");
		System.out.println("2.hang dien may");
		System.out.println("3.hang su");
		int item = new Scanner(System.in).nextInt();
		System.out.println("nhap vao so luong mat hang: ");
		int n = new Scanner(System.in).nextInt();
		for (int i = 0; i < 2; i++) {
			ds.add(item);
		}
		ds.hienThi();
	}
}
