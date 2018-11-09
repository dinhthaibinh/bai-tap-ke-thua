package com.binh.bai5;

import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	private long donGia;
	
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	
	public KhachHangNuocNgoai() {
		super();
	}
	public KhachHangNuocNgoai(String quocTich, long donGia) {
		super();
		this.quocTich = quocTich;
		this.donGia = donGia;
	}
	
	@Override
	public long thanhTien() {
		return getSoDienTieuThu() * donGia;
	}
	
	public void nhapKhachNgoai() {
		super.nhapHoaDon();
		System.out.println("nhap vao don gia: ");
		this.donGia = new Scanner(System.in).nextLong();
		System.out.println("nhap vao quoc tich: ");
		this.quocTich = new Scanner(System.in).nextLine();
	}
	
	public void xuatKhachHang() {
		super.xuatHoaDon();
		System.out.println("don gia: " + this.donGia);
		System.out.println("quoc tich: " + this.quocTich);
		System.out.println("thanh tien: " + this.thanhTien());
	}
}

