package org.example.HW1;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(1000.00, 80)).isEqualTo(200.00);
    }
}
