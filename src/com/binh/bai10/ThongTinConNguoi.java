package com.binh.bai10;

import java.util.Scanner;

public class ThongTinConNguoi {
	private String ten;
	private String diaChi;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public ThongTinConNguoi() {
		this.ten = "";
		this.diaChi = "";
	}
	
	public ThongTinConNguoi(String ten, String diaChi) {
		this.ten = ten;
		this.diaChi = diaChi;
	}
	
	public void nhap() {
		System.out.println("nhap vao ten: ");
		this.ten = new Scanner(System.in).nextLine();
		System.out.println("nhap vao dia chi: ");
		this.diaChi = new Scanner(System.in).nextLine();
	}
	
	public void xuat() {
		System.out.println("ten: " + this.ten);
		System.out.println("dia chi: " + this.diaChi);
	}
}
