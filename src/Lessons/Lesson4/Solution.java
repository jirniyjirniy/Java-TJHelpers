package Lessons.Lesson4;

import java.util.Arrays;

public class Solution {
    public static String[] strings = new String[]{"I", "love", "Python"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static Integer[] array = {1, 2, 3};
    public static int[][] array2 = {{1, 1}, {2, 2}, {3, 3}};
    public static int[][][] array3 = {{{1, 2, 3}, {1}}, {{}}};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));
    }
}
