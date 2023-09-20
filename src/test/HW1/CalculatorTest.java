package HW1;

import org.assertj.core.api.Assertions;
import org.example.HW1.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Assertions.assertThat(Calculator.calculateDiscount(1000.00, 80)).isEqualTo(200.00);

        // Позитивный случай: правильная сумма скидки
        assertThat(Calculator.calculateDiscount(1000.00, 80)).isEqualTo(200.00);

        // Позитивный случай: сумма скидки равна 0
        assertThat(Calculator.calculateDiscount(1000.00, 0)).isEqualTo(1000.00);

        // Негативный случай: сумма скидки больше 100% (недопустимо)
        assertThatThrownBy(() -> Calculator.calculateDiscount(1000.00, 110))
                .isInstanceOf(IllegalArgumentException.class);

        // Негативный случай: отрицательная сумма скидки (недопустимо)
        assertThatThrownBy(() -> Calculator.calculateDiscount(1000.00, -50))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
