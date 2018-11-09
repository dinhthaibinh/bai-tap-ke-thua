package com.binh.bai3;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private int n;
	
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public GiaoDichTienTe () {
		super();
		this.tiGia = 1;
	}
	
	public GiaoDichTienTe(double tiGia) {
		super();
		this.tiGia = tiGia;
	}
	
	public double thanhTien() {
		double thanhTien;
		System.out.println("nhap vao loai tien muon doi");
		System.out.println("1:USD hoac Euro");
		System.out.println("2:VND");
		if (n == 1) {
			thanhTien = this.getSoLuong() * this.getDonGia() * this.tiGia;
			return thanhTien;
		}
		if (n == 2) {
			thanhTien = this.getSoLuong() * getDonGia();
			return thanhTien;
		}
		else {
			return 0;
		}
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao ti gia: ");
		this.thanhTien();
	}
	public void xuat() {
		super.xuat();
		System.out.println("ti gia: " + this.tiGia);
		System.out.println("thanh tien: " + this.thanhTien());
	}
}
