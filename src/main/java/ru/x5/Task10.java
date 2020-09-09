package ru.x5;

// Дан массив целых чисел:
//[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
//нули в конец массива. Вывести результат в консоль
public class Task10 {
    public static void main(String[] args) {
        int[] mas = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("Исходный массив:");
        for (int el : mas) {
            System.out.print(el + " ");
        }
        int indexBeforeLastZero = mas.length - 1;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == 0) {
                for (int j = i; j < indexBeforeLastZero; j++) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
                indexBeforeLastZero--;
            }
        }
        System.out.println("\nПреобразованный массив:");
        for (int el : mas) {
            System.out.print(el + " ");
        }
    }
}
