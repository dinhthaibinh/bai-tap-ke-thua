package com.binh.bai5;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class KhachHang {
	private int maKhachHang;
	private String hoVaTen;
	private Date ngayRaHoaDon;
	private long soDienTieuThu;
	
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Date getNgayRaHoaDon() {
		return ngayRaHoaDon;
	}
	public void setNgayRaHoaDon(Date ngayRaHoaDon) {
		this.ngayRaHoaDon = ngayRaHoaDon;
	}
	public long getSoDienTieuThu() {
		return soDienTieuThu;
	}
	public void setSoDienTieuThu(long soDienTieuThu) {
		this.soDienTieuThu = soDienTieuThu;
	}
	
	public KhachHang() {
	}
	
	public KhachHang(int maKhachHang, String hoVaTen, Date ngay) {
		this.maKhachHang = maKhachHang;
		this.hoVaTen = hoVaTen;
		this.ngayRaHoaDon = ngay;
	}
	
	public void nhapHoaDon() {
		System.out.println("nhap vao ma khach hang: ");
		this.maKhachHang = new Scanner(System.in).nextInt();
		System.out.println("nhap vao ho va ten khach hang: ");
		this.hoVaTen = new Scanner(System.in).nextLine();
		System.out.println("nhap vao so dien tieu thu: ");
		this.soDienTieuThu = new Scanner(System.in).nextLong();
        System.out.println("Nhập vào ngay Nhap: ");
        try {
            String ngay = new Scanner(System.in).nextLine();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayRaHoaDon = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	public void xuatHoaDon() {
		System.out.println("ma khach hang: " + this.maKhachHang);
		System.out.println("ten khach hang: " + this.hoVaTen);
		System.out.println("so dien tieu thu: " + this.soDienTieuThu);
		System.out.println("ngay giao dich: " + this.ngayRaHoaDon.toString());
	}
	
	public long thanhTien() {
		return 0;
	}

}
