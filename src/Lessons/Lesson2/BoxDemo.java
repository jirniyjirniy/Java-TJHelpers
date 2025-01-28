package Lessons.Lesson2;

class Boxy {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
//        System.out.println("Volume is " + volume);
    }

    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Boxy myBox = new Boxy();
        Boxy myBox2 = new Boxy();
        double vol;

 /*     myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;*/

//        Оптимизированный код

        myBox.setDim(2.0, 2.0, 2.0);
        myBox2.setDim(2.0, 2.0, 2.0);

/*
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем коробки равен: " + vol);

        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Объем второй коробки равен: " + vol);*/

        vol = myBox.volume();
        System.out.println("Volume: " + vol);
        System.out.println("Volume: " + myBox2.volume()); // Оптимизированный вывод
    }
}
