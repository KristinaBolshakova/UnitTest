package org.example.FinalTask;

import static org.example.FinalTask.Average.averageArrays;

public class Main {
    public static void main(String[] args) {
        int[] firstNumArray = new int[] {2, 5, 9, 1, 6};
        int[] secondNumArray = new int[] {2, 5, 9, 1, 5};

        System.out.println(averageArrays(firstNumArray, secondNumArray));
    }
}
