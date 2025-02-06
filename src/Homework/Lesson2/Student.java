package Homework.Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private List<Integer> grades;

    public Student(String firstName, String lastName, String studentID, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.grades = new ArrayList<>(grades);
    }

    public void calculateAverageGrade(){
        float avg, sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        avg = sum / grades.size();
        System.out.println("Средняя оценка " + avg);
    }

    public void displayInfo() {
        System.out.println("Інформація про студента:");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Номер студентського квитка: " + studentID);
        System.out.println("Оцінки: " + grades);
        calculateAverageGrade();
    }

    public static void main(String[] args) {
        Student student = new Student("Nikita", "Chernetskyi", "L238", Arrays.asList(10, 10, 9, 8, 10, 11));
        student.displayInfo();
    }

}
