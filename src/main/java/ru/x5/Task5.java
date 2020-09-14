package ru.x5;

import java.util.Scanner;

//  Ввести три целых числа с консоли. Вывести на
//экран наименьшее из них
public class Task5 {
    public static void main(String[] args) {
        long[] arr = new long[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите целое число №" + (i + 1));
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextLong();
        }
        long min = arr[0];
        for (int i = 1; i < 3; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
}
