package com.binh.bai4;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat{
	private int loaiDat;
	private double tinhTien;

	public double getTinhTien() {
		return tinhTien;
	}

	public void setTinhTien(double tinhTien) {
		this.tinhTien = tinhTien;
	}

	public int getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(int loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	public GiaoDichDat() {
		super();
		this.loaiDat = 0;
	}
	
	public GiaoDichDat(int loaiDat) {
		super();
		this.loaiDat = loaiDat;
	}

	@Override
	public double thanhTien() {
		System.out.println("nhap vao loi dat" +
				"1 : dat loai A" +
				"2: dat loai B" +
				"3: dat loai C");
		do {
			this.loaiDat = new Scanner(System.in).nextInt();
		}while (this.loaiDat != 1 && this.loaiDat != 2 && this.loaiDat != 3);


		switch (this.loaiDat){
			case 1:
				this.tinhTien = getDienTich() * getDonGia() * 1.5;
				break;
			case 2:
				this.tinhTien = getDienTich() * getDonGia();
				break;
				case 3:
				this.tinhTien= getDienTich() * getDonGia();
			break;
			default: break;
			}

		return tinhTien;
	}

	@Override
	public void nhap() {
		super.nhap();
		this.thanhTien();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("loai dat: " + this.loaiDat);
		System.out.println("gia tien" +this.tinhTien);
	}
}
