package com.binh.bai7;

import java.util.Scanner;

public class Employee extends PerSon {
	private double heSoLuong;
	private int gioLam;
	
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double luong) {
		this.heSoLuong = luong;
	}
	public int getGioLam() {
		return gioLam;
	}
	public void setGioLam(int gio) {
		this.gioLam = gio;
	}
	
	public Employee() {
		super();
		this.heSoLuong = 0;
		this.gioLam = 0;
	}
	
	public Employee(double heSoLuong, int gioLam) {
		super();
		this.heSoLuong = heSoLuong;
		this.gioLam = gioLam;
	}
	
	public double tinhLuong() {
		return (double) (gioLam * heSoLuong);
	}
	
	@Override
	public String toString() {
		return "ho ten: " + getHoTen() + "dia chi: " + getDiaChi()
							+ "tien luong: " + this.tinhLuong();
	}
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao gio lam:");
		this.gioLam = new Scanner(System.in).nextInt();
		System.out.println("nhap vao he so luong:");
		this.heSoLuong = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void xuat() {
		System.out.println("" + toString());
	}
}
