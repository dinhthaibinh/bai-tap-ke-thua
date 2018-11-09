package com.binh.bai8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.SimpleAttributeSet;

public class HangSu extends MatHangChung {
	private String nhaSanXuat;
	private Date ngayNhap;
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	public HangSu() {
		super();
		this.nhaSanXuat = "";
	}
	
	public HangSu (String nhaSX) {
		super();
		this.nhaSanXuat = nhaSX;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao nha san xuat: ");
		this.nhaSanXuat = new Scanner(System.in).nextLine();
		System.out.println("nhap vao ngay nhap hang: ");
		String ngay = new Scanner(System.in).nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngayNhap = df.parse(ngay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("nha san xuat: " + this.nhaSanXuat);
		System.out.println("ngay nhap hang: " + this.ngayNhap);
	}
}
