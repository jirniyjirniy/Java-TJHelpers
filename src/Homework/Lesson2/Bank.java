package Homework.Lesson2;

public class Bank {
    public String name;
    public double balance;
    public double interestRate;

    public Bank(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void applyInterest() {
        this.balance *= interestRate;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
    }


    public static void main(String[] args) {
        Bank bank = new Bank("Bank 1", 11235.0, 2.5);
        bank.withdraw(10);
        bank.applyInterest();
        bank.displayInfo();
    }
}
