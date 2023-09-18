package HW1;

import org.assertj.core.api.Assertions;
import org.example.HW1.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Assertions.assertThat(Calculator.calculateDiscount(1000.00, 80)).isEqualTo(200.00);
    }
}
