package com.binh.bai3;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
	private int loaiVang;
	
	public int getLoaiVang() {
		return loaiVang;
	}
	public void setLoaiVang(int loaiVang) {
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang() {
		super();
		this.loaiVang = 1;
	}
	
	public GiaoDichVang(int loaiVang) {
		super();
		this.loaiVang = loaiVang;
	}
	
	public double thanhTien() {
		double thanhTien;
		return thanhTien = getSoLuong() * getDonGia();
	}
	
	public void nhapGiaoDichVang() {
		super.nhap();
		System.out.println("nhap loai vang: ");
		this.loaiVang = new Scanner(System.in).nextInt();
	}
	
	public void xuatGiaoDichVang() {
		super.xuat();
		System.out.println("loai vang giao dich: " + this.loaiVang);
		System.out.println("so tien sau khi giao dich: " + this.thanhTien());
	}
}
