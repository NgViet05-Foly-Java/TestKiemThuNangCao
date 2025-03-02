package com.example.OnTapKTNCLan1.Service;

import com.example.OnTapKTNCLan1.Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();
    public SinhVien suaSinhVien(SinhVien sinhVien, String tenMoi, int tuoiMoi,
                                float diemMoi, int kyHocMoi, String chuyenNganhMoi ){
        if(tenMoi.isEmpty() || chuyenNganhMoi.isEmpty()){
            throw new IllegalArgumentException("Ten va chuyen nganh khong ducc de trong");
        } if (tuoiMoi<18 || tuoiMoi >30){
            throw new IllegalArgumentException("Tuoi khong hop le");
        }
        sinhVien.setTenSinhVien(tenMoi);
        sinhVien.setTuoi(tuoiMoi);
        sinhVien.setDiemTrungBinh(diemMoi);
        sinhVien.setKyHoc(kyHocMoi);
        sinhVien.setChuyenNganh(chuyenNganhMoi);
        return sinhVien;
    }
    public void themSinhVien(SinhVien sinhVien){
        if(sinhVien ==null || sinhVien.getMaSinhVien().isEmpty() || sinhVien.getTenSinhVien().isEmpty()){
            throw new IllegalArgumentException("Thong tin sinh vien khong hop le");
        }
        danhSachSinhVien.add(sinhVien);
    }
    public boolean xoaSinhVien(String maSV){
         return danhSachSinhVien.removeIf(sinhVien -> sinhVien.getMaSinhVien().equals(maSV));
    }
    public SinhVien timSinhVien(String maSV){
        return danhSachSinhVien.stream().filter(sinhVien -> sinhVien.getMaSinhVien().equals(maSV))
                .findFirst().orElse(null);
    }
}
