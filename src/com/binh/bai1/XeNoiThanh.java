package com.binh.bai1;

import java.util.Scanner;

public class XeNoiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNoiThanh(){}

//    public XeNoiThanh(int maSoChuyenXe, String tenTaiXe, int soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
//        super(maSoChuyenXe, tenTaiXe, soXe, doanhThu);
//        this.noiDen = noiDen;
//        this.soNgayDiDuoc = soNgayDiDuoc;
//    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap noi den ");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("nhap vao so ngay di dc");
        this.soNgayDiDuoc = new Scanner(System.in).nextInt();

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("noi den" + this.noiDen);
        System.out.println("so ngay di dc" + this.soNgayDiDuoc);
        System.out.println("doanh thu" + thanhtien());
    }

    @Override
    public double thanhtien() {
        return this.soNgayDiDuoc * getDoanhThu();
    }


}
