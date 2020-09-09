package ru.x5;

import java.util.Scanner;

// Ввести целое число в консоли. Вывести его строкуописание вида «отрицательное четное число»,
//«нулевое число», «положительное нечетное число» и т. д.
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        String sign;
        String parity;
        if (value == 0) {
            System.out.println("нулевое число");
            return;
        }
        sign = value > 0 ? "положительное" : "отрицательное";
        parity = value % 2 == 0 ? "четное" : "нечетное";
        System.out.println(String.format("%s %s число", sign, parity));
    }
}
