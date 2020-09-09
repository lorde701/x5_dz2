package ru.x5;

import java.util.Scanner;

// Ввести целое трехзначное число в консоли и найти
//         сумму цифр этого трехзначного числа
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        System.out.println("Сумма цифр введенного числа: " + sum);
    }
}
