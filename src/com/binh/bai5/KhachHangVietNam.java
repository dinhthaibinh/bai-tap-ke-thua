package com.binh.bai5;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang {
	private long donGia;
	private long dinhMuc;

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public long getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(long dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	public KhachHangVietNam() {
		super();
	}

	public KhachHangVietNam(long donGia, long dinhMuc) {
		super();
		this.donGia = donGia;
		this.dinhMuc = dinhMuc;
	}

	@Override
	public long thanhTien() {
		if (getSoDienTieuThu() >= dinhMuc) {
			return getSoDienTieuThu() * donGia;
		} else {
			return (long) (getSoDienTieuThu() * donGia 
					* (dinhMuc + (getSoDienTieuThu() - dinhMuc)) 
					* donGia * 2.5);
		}
	}

	public void nhapKhachViet() {
		super.nhapHoaDon();
		System.out.println("nhap vao don gia: ");
		this.donGia = new Scanner(System.in).nextLong();
		System.out.println("nhap vao dinh muc: ");
		this.dinhMuc = new Scanner(System.in).nextLong();
	}

	public void xuatKhachViet() {
		super.xuatHoaDon();
		System.out.println("don gia: " + this.donGia);
		System.out.println("dinh muc: " + this.dinhMuc);
		System.out.println("thanh tien: " + this.thanhTien());
	}
}
