

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {
    private static final Logger log= LoggerFactory.getLogger(ShippingCalculator.class);
    public double calculate(double weight, String type) {
        if (weight <= 0) {
            log.error("Loi du lieu: Can nang khong hop le (weight={})", weight);
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (type.equals("EXPRESS")) {
            log.info("Tinh phi EXPRESS thanh cong: fee={}", weight * 5000 + 20000);
            return weight * 5000 + 20000;
        }
        if (type.equals("STANDARD")) {
            double fee = weight * 3000;
            log.info("Tinh phi STANDARD thanh cong: fee={}",weight * 3000);
            return weight * 3000;
        }

        log.error("Loi du lieu: Loai van chuyen khong ton tai (type={})", type);
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}