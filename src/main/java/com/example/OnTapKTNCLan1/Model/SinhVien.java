package com.example.OnTapKTNCLan1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private Integer tuoi;
    private float diemTrungBinh;
    private Integer kyHoc;
    private String chuyenNganh;
}
