package Homework.Lesson5;

import java.util.Arrays;

public class Dublicates {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];


        return Arrays.copyOf(temp, j);
    }


    public static void main(String[] args) {
        int[] array1 = {4, 2, 2, 8, 4, 6, 8, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array1));
        int[] uniqueArray = removeDuplicates(array1);
        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArray));
    }
}
