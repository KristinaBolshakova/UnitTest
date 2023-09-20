package org.example.S1.tasks;

/**
 * **Задание:** Нужно исправить метод сложения двух чисел так, чтобы при переполнении переменной
 * (Запустить пример  System.out.println(sum(2_147_483_647, 2)) ) выбрасывалось предупреждение
 * <p>
 * ```java
 * public static int sum(int a, int b) {
 * <p>
 * return a+b;
 * }
 * ```
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(2_147_483_647, 2));
    }

    public static int sum(int a, int b) {
        String msg = "Слишком большое число";
        int sum = a + b;
        assert sum > Integer.MAX_VALUE : msg;
        return sum;
    }
}
