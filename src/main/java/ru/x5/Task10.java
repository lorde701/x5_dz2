package ru.x5;

// Дан массив целых чисел:
//[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
//нули в конец массива. Вывести результат в консоль
public class Task10 {
    public static void main(String[] args) {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("Исходный массив:");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        int indexBeforeLastZero = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < indexBeforeLastZero; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                indexBeforeLastZero--;
            }
        }
        System.out.println("\nПреобразованный массив:");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
