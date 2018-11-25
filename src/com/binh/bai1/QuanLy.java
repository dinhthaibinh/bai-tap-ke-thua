package com.binh.bai1;

import java.util.Scanner;

public class QuanLy {
    private ChuyenXe[] chuyenXes;
    private int count;
    private int n;

    public QuanLy() {
        chuyenXes = new ChuyenXe[100];
        this.count = 0;
        this.n = 0;
    }

    public void nhapChuyenXe(){
        System.out.println("so luong xe can nhap");
        this.count = new Scanner(System.in).nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("nhap loai xe:");
            this.n = new Scanner(System.in).nextInt();
            switch (this.n){
                case 1:
                    chuyenXes[count] = new XeNoiThanh();
                    chuyenXes[count].nhap();
                    break;
                case 2:
                    chuyenXes[count] = new XeNgoaiThanh();
                    chuyenXes[count].nhap();
                    break;
            }
        }
    }

    public void xuatXe(){
        for (int i = 0; i < count; i++) {
            chuyenXes[count].xuat();
        }
    }
}
