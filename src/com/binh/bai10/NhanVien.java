package com.binh.bai10;

import java.nio.channels.GatheringByteChannel;
import java.util.Scanner;

public class NhanVien extends ThongTinConNguoi {
	private int chucVu;
	
	private static final int GIAM_DOC = 1;
	private static final int PHO_PHONG = 2;
	private static final int NHAN_VIEN = 3;
	
	public int getChucVu() {
		return chucVu;
	}
	public void setChucVu(int chucVu) {
		this.chucVu = chucVu;
	}
	
	public NhanVien() {
		super();
		this.chucVu = 0;
	}
	
	public NhanVien(long luong, int chucVu) {
		super();
		this.chucVu = chucVu;
	}
	
	public long tinhLuong() {
		switch (chucVu) {
		case GIAM_DOC:
			System.out.println("luong 8000USD/thang");
			break;
		case PHO_PHONG:
			System.out.println("luong 3000USD/thang");
			break;
		default:
			System.out.println("luong 200USD/gio");
			System.out.println("nhap vao gio lam: ");
			int gio = new Scanner(System.in).nextInt();
			return (long)(gio * 200);
		}
		return 0;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao chuc vu: ");
		this.chucVu = new Scanner(System.in).nextInt();
		this.tinhLuong();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("chuc vu: " + this.chucVu);
		System.out.println("luong " + this.tinhLuong());
	}
}
