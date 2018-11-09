package com.binh.bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class GiaoDich {
	private int maGiaoDich;
	private double donGia;
	private double soLuong;
	private Date ngayGiaoDich;
	
	public int getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}

	public GiaoDich() {
		this.maGiaoDich = 1;
		this.donGia = 1;
		this.soLuong = 1;
	}
	
	public GiaoDich(int maGiaoDich, double donGia, double soLuong) {
		this.donGia = donGia;
		this.maGiaoDich = maGiaoDich;
		this.soLuong = soLuong;
	}
	
	public void nhap() {
		System.out.println("nhap vao ma giao dich: ");
		this.maGiaoDich = new Scanner(System.in).nextInt();
		System.out.println("nhap vao so luong giao dich: ");
		this.soLuong = new Scanner(System.in).nextDouble();
		System.out.println("nhap vao don gia: ");
		this.donGia = new Scanner(System.in).nextDouble();
		System.out.println("nhap vao ngay giao dich: ");
		String ngay = new Scanner(System.in).nextLine();
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			this.ngayGiaoDich = df.parse(ngay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void xuat() {
		System.out.println("ma giao dich: " + this.maGiaoDich);
		System.out.println("so luong giao dich: " + this.soLuong);
		System.out.println("don gia giao dich: " + this.donGia);
		System.out.println("ngay giao dich: " + this.ngayGiaoDich);
	}
}
