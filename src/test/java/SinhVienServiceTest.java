import com.example.OnTapKTNCLan1.Model.SinhVien;
import com.example.OnTapKTNCLan1.Service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SinhVienServiceTest {
    private SinhVienService sinhVienService;
    private SinhVien sinhVien;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
        sinhVien = new SinhVien("SV001", "Nguyen Van A", 20, 7.5f, 3, "CNTT");
        sinhVienService.themSinhVien(sinhVien);
    }
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
            sinhVienService.suaSinhVien(sinhVien, "", 20, 8.0f, 3, "");
        });
        assertEquals("Ten va chuyen nganh khong ducc de trong", exception.getMessage());
    }
    @Test
    void testThemSinhVien_ThanhCong() {
        SinhVien newSV = new SinhVien("SV002", "Le Van B", 21, 8.0f, 4, "Marketing");
        sinhVienService.themSinhVien(newSV);
        assertEquals(newSV, sinhVienService.timSinhVien("SV002"));
    }

    @Test
    void testXoaSinhVien_ThanhCong() {
        assertTrue(sinhVienService.xoaSinhVien("SV001"));
        assertNull(sinhVienService.timSinhVien("SV001"));
    }

    @Test
    void testXoaSinhVien_KhongTonTai() {
        assertFalse(sinhVienService.xoaSinhVien("SV999"));
    }

    @Test
    void testTimSinhVien_TonTai() {
        assertNotNull(sinhVienService.timSinhVien("SV001"));
    }

    @Test
    void testTimSinhVien_KhongTonTai() {
        assertNull(sinhVienService.timSinhVien("SV999"));
    }
}