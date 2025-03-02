import com.example.OnTapKTNCLan1.TinhTong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TinhTongTest {
    @Test
    void testMangRong(){
        TinhTong tinhTong = new TinhTong();
        assertEquals(0, tinhTong.TinhTongMang(new int[]{}));
    }
    @Test
    void testMotPhanTu() {
        TinhTong tinhTong = new TinhTong();
        assertEquals(5, tinhTong.TinhTongMang(new int[]{5}));
    }

    @Test
    void testNhieuPhanTu() {
        TinhTong tinhTong = new TinhTong();
        assertEquals(15, tinhTong.TinhTongMang(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testSoAm() {
        TinhTong tinhTong = new TinhTong();
        assertEquals(-5, tinhTong.TinhTongMang(new int[]{-1, -2, -2}));
    }

    @Test
    void testSoLon() {
        TinhTong tinhTong = new TinhTong();
        assertEquals(1000000, tinhTong.TinhTongMang(new int[]{500000, 500000}));
    }
}
