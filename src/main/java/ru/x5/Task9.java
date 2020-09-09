package ru.x5;

// Дан массив целых чисел:
//[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
//Переставить элементы массива в обратном порядке.
//Вывести результат в консоль
public class Task9 {
    public static void main(String[] args) {
        int[] mas = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.println("Исходный массив:");
        for (int el : mas) {
            System.out.print(el + " ");
        }
        for (int i = 0; i < mas.length / 2; i++) {
            int temp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = temp;
        }
        System.out.println("\nПеревернутый массив:");
        for (int el : mas) {
            System.out.print(el + " ");
        }
    }
}
