package com.binh.bai11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QuanLy ql = new QuanLy();
		System.out.println("chon danh sach muon them");
		System.out.println("1.sinh vien trung cap");
		System.out.println("2.sinh vien cao dang");
		System.out.println("3.sinh vien dai hoc");
		int item = new Scanner(System.in).nextInt();
		System.out.println("so luong sinh vien");
		int n = new Scanner(System.in).nextInt();
		for (int i = 0; i < n; i++) {
			ql.add(item);
			
		}
		ql.hienThi();
	}
}
