package Homework.Lesson2;

public class Car {
    public String make;
    public String model;
    public int year;
    public double mileage;

    public void increaseMileage(double additionalMileage) {
        mileage += additionalMileage;
    }

    public void displayInfo(){
        System.out.println("Марка авто: " + make);
        System.out.println("Модель авто: " + model);
        System.out.println("Год выпуска авто: " + year);
        System.out.println("Пробег авто: " + mileage);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.make = "BMW";
        car.model = "X3 m40i";
        car.year = 2019;
        car.mileage = 20000;

        car.displayInfo();
    }
}
