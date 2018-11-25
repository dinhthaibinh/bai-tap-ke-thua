package com.binh.bai8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends MatHangChung {
	private Date ngaySanXuat;
	private Date ngayHetHan;
	private String nhaSanXuat;
	
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	
	public HangThucPham() {
		super();
		this.nhaSanXuat = "";
	}

	public HangThucPham(int maHang, String tenHang, long soLuong, long donGia, Date ngaySanXuat, Date ngayHetHan, String nhaSanXuat) {
		super(maHang, tenHang, soLuong, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		if (ngayHetHan.before(ngaySanXuat)){
			this.ngayHetHan = ngaySanXuat;
		}
		this.nhaSanXuat = nhaSanXuat;
	}

	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao nha san xuat: ");
		this.nhaSanXuat = new Scanner(System.in).nextLine();
		System.out.println("nhap va ngay san xuat: ");
		String ngay = new Scanner(System.in).nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaySanXuat = df.parse(ngay);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("nhap vao ngay het han: ");
		String ngay1 = new Scanner(System.in).nextLine();
		DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngayHetHan = df1.parse(ngay1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("nha san xuat: " + this.nhaSanXuat);
		System.out.println("ngay san xuat: " + this.ngaySanXuat);
		System.out.println("ngay het han: " + this.ngayHetHan);
	}

//	public boolean danhGia(Date ngayHetHan){
//		return this.getSoLuongTon() > 3 ? KHO_BAN : BAN_DUOC ;
//	}
}
