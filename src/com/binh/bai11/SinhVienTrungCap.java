package com.binh.bai11;

import java.util.Scanner;

public class SinhVienTrungCap extends SinhVien{
	private double diemMon1;
	private double diemMon2;
	private double diemMon3;
	
	public double getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(double diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public double getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(double diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public double getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(double diemMon3) {
		this.diemMon3 = diemMon3;
	}
	
	public SinhVienTrungCap() {
		super();
		this.diemMon1 = 0;
		this.diemMon2 = 0;
		this.diemMon3 = 0;
	}
	public SinhVienTrungCap(double diem1, double diem2 , double diem3) {
		super();
		this.diemMon1 = diem1;
		this.diemMon2 = diem2;
		this.diemMon3 = diem3;
	}
	
	public double trungBinhMon() {
		return (diemMon1 + diemMon2 + diemMon3)/3;
	}
	
	public void danhGia() {
		if (trungBinhMon() <= 4 ) {
			System.out.println("thi lai");
		}if (trungBinhMon() >= 8) {
			System.out.println("hoc luc gioi");
		}
		else {
			System.out.println("qua mon");
		}
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap diem mon 1: ");
		this.diemMon1 = new Scanner(System.in).nextDouble();
		System.out.println("nhap diem mon 2: ");
		this.diemMon2 = new Scanner(System.in).nextDouble();
		System.out.println("nhap diem mon 3: ");
		this.diemMon3 = new Scanner(System.in).nextDouble();
		this.trungBinhMon();
	}
	
	@Override
	public void xuat() {
		System.out.println("diem mon 1: " + this.diemMon1);
		System.out.println("diem mon 2: " + this.diemMon2);
		System.out.println("diem mon 3: " + this.diemMon3);
		System.out.println("trung binh mon: " + this.trungBinhMon());
		this.danhGia();
	}
}
