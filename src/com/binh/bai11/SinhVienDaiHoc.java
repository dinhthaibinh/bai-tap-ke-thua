package com.binh.bai11;

import java.util.Scanner;


public class SinhVienDaiHoc extends SinhVien {
	private int soTinChiTichLuy;

	public int getSoTinChiTichLuy() {
		return soTinChiTichLuy;
	}
	public void setSoTinChiTichLuy(int soTinChiTichLuy) {
		this.soTinChiTichLuy = soTinChiTichLuy;
	}
	
	public SinhVienDaiHoc() {
		super();
		this.soTinChiTichLuy = 0;
	}
	public SinhVienDaiHoc(int soTinChi) {
		super();
		this.soTinChiTichLuy = soTinChi;
	}
	
	public void xetTinChi() {
		if (soTinChiTichLuy < 100) {
			System.out.println("chua dat so tin chi tot nghiep");
		} else {
			System.out.println("du dieu kien tot nghiep");
		}
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao so tin chi da tich luy:");
		this.soTinChiTichLuy = new Scanner(System.in).nextInt();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("so tin tich luy: " + this.soTinChiTichLuy);
		this.xetTinChi();
	}
}
