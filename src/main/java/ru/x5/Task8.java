package ru.x5;

import java.util.Scanner;

// Дан массив целых чисел:
//[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
//массива найти и вывести на экран:
// - максимальное значение
// - сумму положительных элементов
// - сумму четных отрицательных элементов
// - количество положительных элементов
// - среднее арифметическое отрицательных элементов
public class Task8 {
    public static void main(String[] args) {
        int[] mas = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int max = mas[0];
        long posSum = 0;
        int posCount = 0;
        long negSum = 0;
        int negCount = 0;
        int negEvenSum = 0;

        for (int current : mas) {
            if (max < current) {
                max = current;
            }
            if (current > 0) {
                posSum += current;
                posCount++;
            }
            if (current < 0) {
                negSum += current;
                negCount++;
                if (current % 2 == 0) {
                    negEvenSum += current;
                }
            }
        }
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма положительных элементов: " + posSum);
        System.out.println("сумма четных отрицательных элементов: " + negEvenSum);
        System.out.println("количество положительных элементов: " + posCount);
        System.out.println("среднее арифметическое отрицательных элементов: " + (double) negSum / negCount);
    }
}
