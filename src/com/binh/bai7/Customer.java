package com.binh.bai7;

import java.util.Scanner;

public class Customer extends PerSon {
	private String tenCongty;
	private long hoaDon;
	
	public String getTenCongty() {
		return tenCongty;
	}
	public void setTenCongty(String tenCongty) {
		this.tenCongty = tenCongty;
	}
	public long getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(long hoaDon) {
		this.hoaDon = hoaDon;
	}

	public Customer() {
		super();
		this.tenCongty = "";
		this.hoaDon = 0;
	}
	
	public Customer(String congTy, long hoaDon) {
		super();
		this.tenCongty = congTy;
		this.hoaDon = hoaDon;
	}
	
	@Override
	public String toString() {
		return "ho ten: " + getHoTen() + "dia chi: " + getDiaChi()
							+ "ten cong ty: " + tenCongty 
							+ "hoa don: " + hoaDon;
 	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao ten cong ty: ");
		this.tenCongty = new Scanner(System.in).nextLine();
		System.out.println("nhap vao hoa don: ");
		this.hoaDon = new Scanner(System.in).nextLong();
	}
	
	@Override
	public void xuat() {
		System.out.println(toString());
	}
}
