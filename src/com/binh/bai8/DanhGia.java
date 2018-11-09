package com.binh.bai8;

import java.util.Calendar;
import java.util.Date;

public class DanhGia extends HangThucPham {
	public boolean kiemTraHetHan(Date ngayHienTai) {
		Calendar c = Calendar.getInstance();
		c.setTime(getNgayHetHan());
		Calendar d = Calendar.getInstance();
		d.setTime(ngayHienTai);
		return true;
	}
}
