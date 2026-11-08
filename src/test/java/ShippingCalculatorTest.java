

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    ShippingCalculator calc = new ShippingCalculator();

    //@Test
    //void testStandard() {
        //assertEquals(15000.0, calc.calculate(5, "STANDARD"));
    //}

    //@Test
    //void testExpress() {
        //assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    //@Test
    //void testInvalidWeight() {
        //assertThrows(IllegalArgumentException.class,
                //() -> calc.calculate(-1, "STANDARD"));
   // }
    @Test
    void testLogFilePathBug() {
        // Cố tình viết cứng đường dẫn theo dấu gạch chéo ngược của Windows
        String expectedHardcodedPath = "logs\\app.log";

        // Đường dẫn thực tế sinh ra theo chuẩn của hệ điều hành đang chạy
        String actualSystemPath = "logs" + java.io.File.separator + "app.log";

        // Mối liên hệ:
        // - Trên Windows: File.separator là "\" -> expected khớp actual -> PASS
        // - Trên Ubuntu & macOS: File.separator là "/" -> actual là "logs/app.log" khác "logs\app.log" -> FAIL!
        assertEquals(expectedHardcodedPath, actualSystemPath);
    }
}