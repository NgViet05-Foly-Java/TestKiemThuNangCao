package com.example.OnTapKTNCLan1.Service;

import com.example.OnTapKTNCLan1.Model.SinhVien;

public class SinhVienService {
    public SinhVien suaSinhVien(SinhVien sinhVien, String tenMoi, int tuoiMoi,
                                float diemMoi, int kyHocMoi, String chuyenNganhMoi ){
        if(tenMoi.isEmpty() || chuyenNganhMoi.isEmpty()){
            throw new IllegalArgumentException("Ten va chuyen nganh khong ducc de trong");
        }
        sinhVien.setTenSinhVien(tenMoi);
        sinhVien.setTuoi(tuoiMoi);
        sinhVien.setDiemTrungBinh(diemMoi);
        sinhVien.setKyHoc(kyHocMoi);
        sinhVien.setChuyenNganh(chuyenNganhMoi);
        return sinhVien;
    }
}
