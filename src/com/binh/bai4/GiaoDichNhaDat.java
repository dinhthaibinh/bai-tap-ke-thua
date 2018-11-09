package com.binh.bai4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class GiaoDichNhaDat {
	private int maGiaoDich;
	private Date ngayGiaoDich;
	private long donGia;
	private double dienTich;
	
	public int getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public Date getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	
	public GiaoDichNhaDat() {
		this.maGiaoDich = 1;
		this.donGia = 0;
		this.dienTich = 0;
	}
	
	public GiaoDichNhaDat(int maGiaoDich, long donGia, double dienTich) {
		this.maGiaoDich = maGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	public void nhap() {
		System.out.println("nhap vao ma giao dich: ");
		this.maGiaoDich = new Scanner(System.in).nextInt();
		System.out.println("nhap vao don gia: ");
		this.donGia = new Scanner(System.in).nextLong();
		System.out.println("nhap dien tich dat: ");
		this.dienTich = new Scanner(System.in).nextDouble();
		System.out.println("ngay giao dich: ");
		String ngay = new Scanner(System.in).nextLine() ;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngayGiaoDich = df.parse(ngay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void xuat() {
		System.out.println("ma giao dich: " + this.maGiaoDich);
		System.out.println("don gia: " + this.donGia);
		System.out.println("dien tich: " + this.dienTich);
		System.out.println(toString());
	}
	
	public double thanhTien() {
		return 0;
	}

}
