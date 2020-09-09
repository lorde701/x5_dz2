package ru.x5;

import java.util.Scanner;

//Ввести целое число в консоли и вывести на экран
//        последнюю цифру введенного числа.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Последняя цифра числа: " + value % 10);
    }
}
