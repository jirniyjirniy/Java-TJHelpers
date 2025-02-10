package Homework.Lesson5;

import java.util.*;

public class Shuffle {
    public static void shuffleArray(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list, new Random());
    }

    public static void main(String[] args) {
        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(array2));
        shuffleArray(array2);
        System.out.println("Перемешанный массив: " + Arrays.toString(array2));
    }
}
