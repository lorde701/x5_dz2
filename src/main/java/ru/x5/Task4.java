package ru.x5;

import java.util.Scanner;

// Ввести целое число в консоли. Если оно является
//положительным, то прибавить к нему 1; если
//отрицательным, то вычесть из него 2; если нулевым,
//то заменить его на 10. Вывести полученное число.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        if (value > 0) {
            value += 1;
        } else if (value == 0) {
            value = 10;
        } else {
            value -= 2;
        }
        System.out.println("Результ: " + value);
    }
}
