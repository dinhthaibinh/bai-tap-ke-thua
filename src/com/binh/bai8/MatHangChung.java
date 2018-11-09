package com.binh.bai8;

import java.util.Date;
import java.util.Scanner;

public class MatHangChung {
	private int maHang;
	private String tenHang;
	private long soLuongTon;
	private long donGia;
	
	public int getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public long getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(long soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	
	 public MatHangChung() {
		 this.maHang = 0;
		 this.tenHang = "";
		 this.soLuongTon = 0;
		 this.donGia = 0;
	 }
	 
	 public MatHangChung(int maHang, String tenHang, long soLuong, long donGia) {
		 this.maHang = maHang;
		 this.tenHang = tenHang;
		 this.soLuongTon = soLuong;
		 this.donGia = donGia;
	 }
	 
	 public void nhap() {
		 do {
		 System.out.println("nhap vao ma hang: ");
		 this.maHang = new Scanner(System.in).nextInt();
		 } while(maHang != 0);
		 do { 
		 System.out.println("nhap vao ten hang: ");
		 this.tenHang = new Scanner(System.in).nextLine();
		 }while(tenHang != null);
		 do {
			 System.out.println("nhap vao so luong ton: ");
			 this.soLuongTon = new Scanner(System.in).nextLong();
		} while (soLuongTon >= 0);
		 do {
			 System.out.println("nhap vao don gia: ");
			 this.donGia = new Scanner(System.in).nextLong();
		} while (donGia > 0 );
	}
	 
	public void xuat() {
		System.out.println("ma hang: " + this.maHang);
		System.out.println("ten hang: " + this.tenHang);
		System.out.println("so luong: " + this.soLuongTon);
		System.out.println("son gia: " + this.donGia);
	}
	
	public void danhGia() {
	}
}
