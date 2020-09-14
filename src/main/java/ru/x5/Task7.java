package ru.x5;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
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
        Map<Integer, Pair<String, Float>> codes = new HashMap<Integer, Pair<String, Float>>() {{
            put(905, new Pair<String, Float>("Москва", 4.15f));
            put(194, new Pair<String, Float>("Ростов", 1.98f));
            put(491, new Pair<String, Float>("Краснодар", 2.69f));
            put(800, new Pair<String, Float>("Киров", 5.00f));
        }};

        if (codes.containsKey(value)) {
            Pair<String, Float> cityAndPrise = codes.get(value);
            System.out.println(
                    String.format("%s. Стоимость разговора: %s", cityAndPrise.getKey(), (cityAndPrise.getValue()) * 10));
        } else {
            System.out.println("Город не найден");
        }
    }
}
