package Homework.Lesson2;

public class Book {
    public String title;
    public String author;
    public int yearPublished;
    public double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void discountPrice(double discount) {
        this.price *= discount;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "John Doe", 1995, 10.0);
        Book book2 = new Book("Minecamp**", "John White", 1945, 14.88);

        book1.discountPrice(0.5);
        book2.discountPrice(0.7);

        book1.displayInfo();
        book2.displayInfo();

    }
}
