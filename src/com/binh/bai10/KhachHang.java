package com.binh.bai10;

import java.util.Scanner;

public class KhachHang extends ThongTinConNguoi {
	private String kieuXe;
	private long hoaDon;
	
	public String getKieuXe() {
		return kieuXe;
	}
	public void setKieuXe(String kieuXe) {
		this.kieuXe = kieuXe;
	}
	public long getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(long hoaDon) {
		this.hoaDon = hoaDon;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao kieu xe: ");
		this.kieuXe = new Scanner(System.in).nextLine();
		System.out.println("nhap vao hoa don");
		this.hoaDon = new Scanner(System.in).nextLong();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("kieu xe : " + this.kieuXe);
		System.out.println("hoa don : " + this.hoaDon);
	}
}
