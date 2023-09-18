package org.example.S1.tasks;

public class Task1 {

    /**
     * Метод для проверки количества выходных дней в неделе.
     */
    public static void assertConditionA() {
        // Создаем массив с выходными днями
        String[] weekends = {"Суббота", "Воскресенье"};

        // Используем оператор assert для проверки количества элементов в массиве.
        // Задача - сделать это утверждение верным (длина массива должна быть равна 2).
        assert weekends.length == 3;

        // Если утверждение верно, выводим сообщение о количестве выходных дней.
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void main(String[] args) {
        // Вызываем метод для проверки количества выходных дней
        assertConditionA();
    }
}