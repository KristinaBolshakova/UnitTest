package org.example.S1.tasks;

/**
 * Нужно исправить пример, так чтобы метод не выбрасывал ошибку
 * <p>
 * ```java
 * public static void assertConditionB() {
 * int x = -1;
 * assert x >= 0;
 * }
 * ```
 */
public class Task2 {

    /**
     * Метод assertConditionB() выполняет проверку оператором assert.
     * Оператор assert проверяет, что значение переменной x меньше нуля.
     * Если условие не выполняется, будет выброшено исключение AssertionError.
     * Ваша задача - изменить утверждение, чтобы оно стало истинным, исключая ошибку.
     */
    public static void assertConditionB() {
        // Определение целочисленной переменной x со значением -1
        int x = -1;

        // Использование оператора assert для проверки условия
        // Задача - сделать это утверждение верным, чтобы избежать ошибки AssertionError
        assert x < 0;

        // Если утверждение верно, код продолжает выполнение без ошибок
        System.out.println("Утверждение assert пройдено успешно.");
    }

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        // Вызываем метод assertConditionB() для демонстрации работы оператора assert
        assertConditionB();
    }
}

