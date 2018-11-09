package com.binh.bai8;

import java.util.Scanner;

import javax.xml.ws.WebServiceProvider;

public class HangDienMay extends MatHangChung {
	private int thoiGianBaoHanh;
	private int congSuatKW;
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public int getCongSuatKW() {
		return congSuatKW;
	}
	public void setCongSuatKW(int congSuatKW) {
		this.congSuatKW = congSuatKW;
	}
	
	public HangDienMay() {
		super();
		this.thoiGianBaoHanh = 1;
		this.congSuatKW = 1;
	}
	
	public HangDienMay(int baoHanh, int KW) {
		super();
		this.thoiGianBaoHanh = baoHanh;
		this.congSuatKW = KW;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao thoi gian bao hanh: ");
		this.thoiGianBaoHanh = new Scanner(System.in).nextInt();
		System.out.println("nhap vao cong suat KW: ");
		this.congSuatKW = new Scanner(System.in).nextInt();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("thoi gian bao hanh: " + this.thoiGianBaoHanh);
		System.out.println("cong suat KW" + this.congSuatKW);
	}
}
