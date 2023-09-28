package FinalTask;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.FinalTask.Average.averageArrays;

public class TestAverage {

    @Test
    public void testFirstAverageBigger(){
        int[] firstNumArray = new int[] {2, 5, 9, 1, 6};
        int[] secondNumArray = new int[] {2, 5, 9, 1, 5};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testSecondAverageBigger(){
        int[] firstNumArray = new int[] {2, 5, 9, 1, 6};
        int[] secondNumArray = new int[] {2, 5, 9, 1, 7};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testAverageEquals(){
        int[] firstNumArray = new int[] {2, 5, 9, 1, 6};
        int[] secondNumArray = new int[] {2, 5, 9, 1, 6};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Средние значения равны");
    }
}
