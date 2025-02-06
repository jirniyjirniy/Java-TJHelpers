import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentMain {
    private String name;
    private int age;
    private double grade;
    private String faculty;

    public StudentMain(String name, int age, double grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getFaculty() {
        return faculty;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d, Grade: %.2f, Faculty: %s", name, age, grade, faculty);
    }
}

public class Student {
    private static List<StudentMain> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Show all students");
            System.out.println("2. Find students by criteria");
            System.out.println("3. Add a new student");
            System.out.println("4. Remove a student by name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> showAllStudents();
                case 2 -> findStudentsByCriteria();
                case 3 -> addStudent();
                case 4 -> removeStudentByName();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (StudentMain student : students) {
                System.out.println(student);
            }
        }
    }

    private static void findStudentsByCriteria() {
        System.out.println("Find students by:");
        System.out.println("1. Grade above a certain value");
        System.out.println("2. Age in a specific range");
        System.out.println("3. Specific faculty");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1 -> {
                System.out.print("Enter minimum grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                students.stream()
                        .filter(student -> student.getGrade() > grade)
                        .forEach(System.out::println);
            }
            case 2 -> {
                System.out.print("Enter minimum age: ");
                int minAge = scanner.nextInt();
                System.out.print("Enter maximum age: ");
                int maxAge = scanner.nextInt();
                scanner.nextLine();
                students.stream()
                        .filter(student -> student.getAge() >= minAge && student.getAge() <= maxAge)
                        .forEach(System.out::println);
            }
            case 3 -> {
                System.out.print("Enter faculty: ");
                String faculty = scanner.nextLine();
                students.stream()
                        .filter(student -> student.getFaculty().equalsIgnoreCase(faculty))
                        .forEach(System.out::println);
            }
            default -> System.out.println("Invalid option.");
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter faculty: ");
        String faculty = scanner.nextLine();
        students.add(new StudentMain(name, age, grade, faculty));
        System.out.println("Student added successfully.");
    }

    private static void removeStudentByName() {
        System.out.print("Enter the name of the student to remove: ");
        String name = scanner.nextLine();
        if (students.removeIf(student -> student.getName().equalsIgnoreCase(name))) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("No student found with the given name.");
        }
    }
}
