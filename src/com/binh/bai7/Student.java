package com.binh.bai7;

import java.util.Scanner;

public class Student extends PerSon {
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

	public Student() {
		super();
		this.diemMon1 = 0;
		this.diemMon2 = 0;
	}
	
	public Student(double diem1 , double diem2) {
		super();
		this.diemMon1 = diem1;
		this.diemMon2 = diem2;
	}
	
	public double diemTrungBinh() {
		return (diemMon1 + diemMon2)/2;
	}
	
	public void danhGia() {
		if (diemTrungBinh() < 5) {
			System.out.println("trung binh");
		}
		if (diemTrungBinh() <= 8) {
			System.out.println("gioi");
		} else {
			System.out.println("kha");
		}
	}
	
	@Override
	public String toString() {
		return "ho ten: " + getHoTen() + "dia chi: " + getDiaChi()
							+ "diem mon 1: " + this.diemMon1
							+ "diem mon 2: " + this.diemMon2
							+ "diem trung binh: " + this.diemTrungBinh();
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap diem mon 1: ");
		this.diemMon1 = new Scanner(System.in).nextDouble();
		System.out.println("nhap diem mon 2: ");
		this.diemMon2 = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void xuat() {
		System.out.println("" + toString());
		this.danhGia();
	}
}
