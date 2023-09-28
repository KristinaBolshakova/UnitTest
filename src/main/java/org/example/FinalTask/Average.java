package org.example.FinalTask;

public class Average {

    public static String averageArrays(int[] arr1, int[] arr2){
        float avg1;
        float avg2;
        int sum1 = 0;
        int sum2 = 0;

        for (int num: arr1) {
            sum1 += num;
        }

        for (int num: arr2) {
            sum2 += num;
        }

        avg1 = (float) sum1 /  arr1.length;
        avg2 = (float) sum2 /  arr2.length;

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
