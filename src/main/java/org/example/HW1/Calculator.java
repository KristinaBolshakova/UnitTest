//*Задание 1. * В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
// Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.

package org.example.HW1;



public class Calculator {
    /**
     *
     * @param sumProduct - сумма покупки
     * @param discount - скидка
     * @return возвращает итоговую сумму с учетом скидки
     */
    public static double calculateDiscount(double sumProduct, int discount){
        double result = 0;

        if(discount < 90){
            double sumDiscount = sumProduct * discount/100;
            result = sumProduct - sumDiscount;
        } else {
                    throw new ArithmeticException("Скидка не может быть больше 90%");
                }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Сумма с учетом скидки = " + calculateDiscount(100.00, 20));
    }

}
