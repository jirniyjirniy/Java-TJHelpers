package Homework.Lesson3i1;

import java.util.Scanner;

public class Discount {
    public void checkDiscount(int val, boolean isVip) {
        double discount = 0;
        boolean isVipDiscount = isVip;

        if (val < 1000){
            System.out.println("Скидки на продукты меньше 1000грн нет!");
        } else if (val >= 1000 && val <= 5000) {
            discount = 5;
        } else if (val > 5000 && val <= 10000) {
            discount = 10;
        } else if (val > 10000) {
            discount = 15;
        }


        double discountedValue = discount * val / 100;
        double totalValue = val - discountedValue;

        if (isVipDiscount) {
            double vipDiscount = totalValue * 5 / 100;
            totalValue -= vipDiscount;
            System.out.println("Доп.скидка VIP-клиентам" + vipDiscount);
        }

        System.out.println("Сума покупки до скидки: " + val);
        System.out.println("Скидка равна: " + discountedValue + "грн");
        System.out.println("Конечная сума оплаты: " + totalValue + "грн");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите суму покупки: ");
        int value = sc.nextInt();
        System.out.print("Клиент VIP(true/false): ");
        boolean isVip = sc.nextBoolean();

        Discount discount = new Discount();
        discount.checkDiscount(value, isVip);
    }
}
