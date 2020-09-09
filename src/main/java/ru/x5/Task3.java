package ru.x5;

import java.util.Scanner;

//  Ввести целое число в консоли. Если оно является
//положительным, то прибавить к нему 1, в противном
//случае не изменять его. Вывести полученное число.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        if (value > 0) {
            value += 1;
        }
        System.out.println("Результ: " + value);
    }
}
