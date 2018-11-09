package com.binh.bai3;

import java.util.Scanner;

public class QuanLyGiaoDich {
	private GiaoDich[] danhSachGiaoDich;
	private int count;
	private int n;
	
	public void tuyChonGiaoDich(){
        System.out.println("1:giao dich tien" +
                "2:giao dich vang");
        this.n = new Scanner(System.in).nextInt();
        System.out.println("so luong can giao dich");
        this.count = new Scanner(System.in).nextInt();
        switch (n){
            case 1:
                for (int i = 0; i < count; i++) {
                    danhSachGiaoDich[count] = new GiaoDichTienTe();
                    danhSachGiaoDich[count].nhap();
                }
                break;
            case 2:
                for (int i = 0; i < count; i++) {
                    danhSachGiaoDich[count] = new GiaoDichVang();
                    danhSachGiaoDich[count].nhap();
                }
                default:
                    System.out.println("chi 1 hoac 2");
                    break;
        }
	}

	public void xuatGiaoDich(){
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (this.n == 1) {
                danhSachGiaoDich[count] = new GiaoDichTienTe();
                danhSachGiaoDich[count].xuat();
            }
            else {
                danhSachGiaoDich[count] = new GiaoDichVang();
                danhSachGiaoDich[count].xuat();
            }
        }
    }
	
}
