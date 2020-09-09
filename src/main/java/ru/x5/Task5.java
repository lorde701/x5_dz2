package ru.x5;

import java.util.Scanner;

//  Ввести три целых числа с консоли. Вывести на
//экран наименьшее из них
public class Task5 {
    public static void main(String[] args) {
        long[] mas = new long[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите целое число №" + (i + 1));
            Scanner scanner = new Scanner(System.in);
            mas[i] = scanner.nextLong();
        }
        long min = mas[0];
        for (int i = 1; i < 3; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
}
