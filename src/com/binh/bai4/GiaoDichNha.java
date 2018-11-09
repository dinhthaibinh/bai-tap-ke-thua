package com.binh.bai4;

import java.awt.Dimension;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {
	private int loaiNha;
	private String diaChi;
	
	public int getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(int loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public GiaoDichNha() {
		super();
		this.loaiNha = 0;
		this.diaChi = "";
	}
	
	public GiaoDichNha(int loaiNha, String diaChi) {
		super();
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	
	@Override
	public double thanhTien() {

		if (loaiNha == 1) {
			return (long) (getDienTich() * getDonGia()); 
		}
		if (loaiNha == 2) {
			return (long) (getDienTich() * getDonGia() * 0.9);
		}
		return 0;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao loai nha can thanh toan");
		System.out.println("1(cao cap) hoac 2(thuong)");
		this.loaiNha = new Scanner(System.in).nextInt();
		System.out.println("nhap dia chi");
		this.diaChi = new Scanner(System.in).nextLine();
		this.thanhTien();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("loai nha: " + this.loaiNha);
		System.out.println("dia chi: " + this.diaChi);
		System.out.println("thanh tien: " + this.thanhTien());
	}
}
