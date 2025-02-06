package Lessons.Lesson4;

import java.util.Arrays;

public class SecondSolution {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;


    public static void main(String[] args) {
        if(array.length % 2 == 0) {
            Arrays.fill(array, valueStart, valueEnd, 1);
        } else {
            Arrays.fill(array, valueStart, valueEnd, 1);
        }

        System.out.println(Arrays.toString(array));
    }
}
