package Homework.Lesson5;

import java.util.Arrays;

public class ArrayContains {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {3, 4, 5};

        boolean contains = false;

        for (int i = 0; i <= array1.length - array2.length; i++) {
            // Проверяем, равна ли подстрока массива array1 массиву array2
            if (Arrays.equals(Arrays.copyOfRange(array1, i, i + array2.length), array2)) {
                contains = true;
                break;
            }
        }

        if (contains) {
            System.out.println("Массив 2 содержится в массиве 1.");
        } else {
            System.out.println("Массив 2 не содержится в массиве 1.");
        }
    }
}
