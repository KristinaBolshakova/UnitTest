package HW3;

import org.example.HW3.MainHW;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMainHW {

    // четное число
    @Test
    public void testOddNumber() {
        assertTrue(MainHW.evenOddNumber(2));
    }

    //нечетное число
    @Test
    public void testEvenNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }

    //число входит в интервал
    @Test
    public void testNumberInInterval(){
        assertTrue(MainHW.numberInInterval(100));
    }

    // выход за нижнюю границу интервала
    @Test
    public void testMinNumberNotInInterval(){
        assertFalse(MainHW.numberInInterval(24));
    }

    // выход за верхнюю границу
    @Test
    public void testMaxNumberNotInInterval(){
        assertFalse(MainHW.numberInInterval(101));
    }

}
