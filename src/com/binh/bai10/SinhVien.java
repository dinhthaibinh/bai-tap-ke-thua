package com.binh.bai10;

import java.util.Scanner;

public class SinhVien extends ThongTinConNguoi {
	private double diemMon1;
	private double diemMon2;
	
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
	
	public SinhVien() {
		super();
		this.diemMon1 = 0;
		this.diemMon2 = 0;
	}
	public SinhVien(double diem1, double diem2) {
		super();
		this.diemMon1 = diem1;
		this.diemMon2 = diem2;
	}
	
	public double diemTrungBinh() {
		return (diemMon1 + diemMon2)/2;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap diem mon 1: ");
		this.diemMon1 = new Scanner(System.in).nextDouble();
		System.out.println("nhap diem mon 2: ");
		this.diemMon2 = new Scanner(System.in).nextDouble();
		this.diemTrungBinh();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("diem mon 1: " + this.diemMon1);
		System.out.println("diem mon 2: " + this.diemMon2);
		System.out.println("diem trung binh: " + this.diemTrungBinh());
	}
}
