import com.example.OnTapKTNCLan1.Model.SinhVien;
import com.example.OnTapKTNCLan1.Service.SinhVienService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SinhVienServiceTest {
    SinhVienService sinhVienService = new SinhVienService();
    @Test
    void testSuaSinhVien_HopLe() {
        SinhVien sinhVien = new SinhVien("SV01", "An", 20, 8.5f, 3, "CNTT");
        SinhVien sinhVienMoi = sinhVienService.suaSinhVien(sinhVien, "Bình", 21, 9.0f, 4, "Marketing");

        assertEquals("Bình", sinhVienMoi.getTenSinhVien());
        assertEquals(21, sinhVienMoi.getTuoi());
        assertEquals(9.0f, sinhVienMoi.getDiemTrungBinh(), 0.01);
        assertEquals(4, sinhVienMoi.getKyHoc());
        assertEquals("Marketing", sinhVienMoi.getChuyenNganh());
    }
    @Test
    void testSuaSinhVien_TruongRong() {
        SinhVien sinhVien = new SinhVien("SV02", "An", 19, 7.5f, 2, "CNTT");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.suaSinhVien(sinhVien, "", , 8.0f, 3, "");
        });
        assertEquals("Ten va chuyen nganh khong ducc de trong", exception.getMessage());
    }
}