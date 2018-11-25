package com.binh.bai1;

import java.util.Scanner;

public class XeNgoaiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDiDuoc;



    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public double thanhtien() {
        return 0;
    }
}
