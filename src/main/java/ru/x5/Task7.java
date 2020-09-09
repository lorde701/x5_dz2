package ru.x5;

import java.util.Scanner;

// Написать программу, вычисляющую стоимость 10
//минутного междугороднего разговора в зависимости
//от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
//1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
//руб. ). Пользователь в консоли должен ввести код
//города, а в ответ от программы получить, например,
//при вводе кода 905, - «Москва. Стоимость разговора:
//41.5»
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 905:
                System.out.println("Москва. Стоимость разговора: 4.15");
                return;
            case 194:
                System.out.println("Ростов. Стоимость разговора: 1.98");
                return;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: 2.69");
                return;
            case 800:
                System.out.println("Киров. Стоимость разговора: 5.00");
                return;
            default:
                System.out.println("Город не найден");
        }
    }
}
