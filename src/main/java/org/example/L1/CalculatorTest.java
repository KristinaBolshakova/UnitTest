package org.example.L1;

import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    public static void main(String[] args) {

//        if (4 != Calculator.calculation(2, 2, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (2 != Calculator.calculation(4, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (4 != Calculator.calculation(8, 2, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (6 != Calculator.calculation(3, 2, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }

//        assert 4 == Calculator.calculation(2, 2, '+');
//        assert 2 == Calculator.calculation(4, 2, '-');
//        assert 4 == Calculator.calculation(4, 2, '/');
//        assert 9 == Calculator.calculation(4, 2, '*');

        assertThat(Calculator.calculation(2, 2, '+')).isEqualTo(4);
        assertThat(Calculator.calculation(4, 2, '-')).isEqualTo(2);
        assertThat(Calculator.calculation(8, 2, '/')).isEqualTo(4);
        assertThat(Calculator.calculation(3, 2, '*')).isEqualTo(6);
//
//        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_'))
//                .isInstanceOf(IllegalStateException.class);

//        try {
//            Calculator.calculation(8, 4, '_');
//        } catch (IllegalArgumentException e) {
//            if (!e.getMessage().equals("Uexpected value operator: ")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
    }
}
