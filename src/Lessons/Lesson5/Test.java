package Lessons.Lesson5;

public class Test {
    public static void printLines(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printLines("Hello World", 3);
    }
}
