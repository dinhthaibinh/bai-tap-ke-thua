 package com.binh.bai4;

import java.nio.channels.GatheringByteChannel;
import java.util.Calendar;

public class
QuanLyNhaDat {
	private GiaoDichNhaDat[] danhSachGiaoDich;
	private int count;
	
	public QuanLyNhaDat() {
		this.danhSachGiaoDich = new GiaoDichNhaDat[100];
		this.count = 0;
	}
	
	public void themGiaoDich(int itemp) {
		switch (itemp) {
		case 1:
			danhSachGiaoDich[count] = new GiaoDichDat();
			danhSachGiaoDich[count].nhap();
			count ++;
			break;
		default:
			danhSachGiaoDich[count] = new GiaoDichNha();
			danhSachGiaoDich[count].nhap();
			count ++;
			break;
		}
	}
	
	public boolean add(int itemp) {
		if (count >= 100)
			return false;
		themGiaoDich(itemp);
		return true;
	}
	
	public long tongThanhTienTrungBinhDat() {
		int tong = 0;
		int dem = 0;
		for(GiaoDichNhaDat giaoDichNhaDat : danhSachGiaoDich) {
			if (giaoDichNhaDat instanceof GiaoDichDat) {
				tong += giaoDichNhaDat.thanhTien();
				dem++;
			}
		}if (dem == 0) {
			return tong;
		}
		return 0;
	}
	
	public void xuatGiaoDichDuocChon() {
		for (int i = 0; i < danhSachGiaoDich.length; i++) {
			Calendar c = Calendar.getInstance();
			c.setTime(danhSachGiaoDich[count].getNgayGiaoDich());
			int thang = c.get(Calendar.MONTH)+1;
			int nam = c.get(Calendar.YEAR);
			if (thang == 9 && nam == 2013) {
				danhSachGiaoDich[count].xuat();
			}
		}
	}
	
	
}
