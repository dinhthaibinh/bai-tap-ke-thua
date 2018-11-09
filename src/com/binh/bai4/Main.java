package com.binh.bai4;

import java.util.Scanner;

import com.binh.bai3.GiaoDich;

public class Main {
	public static void main(String[] args) {
//		System.out.println("so luong can giao dich:");
//		int n = new Scanner(System.in).nextInt();
//		System.out.println("loai giao dich (1.dat) (2.nha)");
//		int itemp = new Scanner(System.in).nextInt();
//		QuanLyNhaDat ql = new QuanLyNhaDat();
//		for (int i = 0; i < n; i++) {
//			ql.add(itemp);
//		}
//		ql.xuatGiaoDichDuocChon();
		GiaoDichDat giaoDichDat = new GiaoDichDat();
		giaoDichDat.nhap();
		giaoDichDat.xuat();
	}
}

