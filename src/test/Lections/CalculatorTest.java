package Lections;

import org.example.Lections.Calculator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {

    @Test
    void evaluatesExpression() {
//        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
    }

    @Test
    void subsctractionExpression() {
//        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 1, '-')).isEqualTo(1);
    }

    @Test
    void multiplicationExpression() {
//        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 4, '*')).isEqualTo(8);
    }

    @Test
    void divisionExpression() {
//        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(8, 2, '/')).isEqualTo(4);
    }

    @Test
    void expectedIllegalStateExceptionOnIInvalidOperatorSymbol(){
//        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void getOperandCompletesCorrectlyWithNumbers(){
        String testedValue = "9";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);

        Calculator.getOperand();

        System.out.println(testedValue);
        System.setIn(inputStream);
    }

    @Test
    void getOperandCompletesCorrectlyWithNotNumbers(){
        String testedValue = "k";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(Calculator::getOperand).isInstanceOf(IllegalArgumentException.class)
                        .describedAs("Ошибка в вводимых данных");

        System.setIn(inputStream);
        System.setOut(null);
    }

    @Test
    void computeCircleRadiusWorksCorrectly() {
        assertThat(Calculator.computeAreaCircle(10)).isEqualTo(314.1592653589793);
    }
}
