package com.binh.bai1;

import java.util.Scanner;

public abstract class ChuyenXe {
    private int maSoChuyenXe;
    private String tenTaiXe;
    private int soXe;
    private double doanhThu;

    public int getMaSoChuyenXe() {
        return maSoChuyenXe;
    }

    public void setMaSoChuyenXe(int maSoChuyenXe) {
        this.maSoChuyenXe = maSoChuyenXe;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ma so chuyen xe");
        this.maSoChuyenXe = scanner.nextInt();
        System.out.println("nhap vao ten tai xe");
        this.tenTaiXe = scanner.nextLine();
        System.out.println("nhap vao so xe");
        this.soXe = scanner.nextInt();
        System.out.println("nhap vao doanh thu");
        this.doanhThu = scanner.nextDouble();


    }

    public void xuat(){
        System.out.println("ma chuyen xe" + this.maSoChuyenXe);
        System.out.println("ten tai xe" + this.tenTaiXe);
        System.out.println("so xe" + this.soXe);
        System.out.println("doanh thu" + this.doanhThu);

    }


    public abstract double thanhtien();


}
