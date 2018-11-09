package com.binh.bai7;

import java.util.Scanner;

public class PerSon {
	private String hoTen;
	private String diaChi;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public PerSon () {
		this.hoTen = "";
		this.diaChi = "";
	}
	
	public PerSon(String hoTen, String diaChi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	
	public void nhap() {
		System.out.println("nhap vao ho ten: ");
		this.hoTen = new Scanner(System.in).nextLine();
		System.out.println("nhap vao dia chi: ");
		this.diaChi = new Scanner(System.in).nextLine();
	}
	
	public void xuat() {
		System.out.println("ho ten: " + this.hoTen);
		System.out.println("dia chi: " + this.diaChi);
		
	}
	
	public String toString() {
		return "";
	}
}
