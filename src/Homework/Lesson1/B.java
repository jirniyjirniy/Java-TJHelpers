package Homework.Lesson1;

public class B {
    public void printFields(){
        A a = new A();
        System.out.println("Public Field: " + a.publicField);
        System.out.println("Protected Field: " + a.protectedField);
        System.out.println("Default Field: " + a.defaultField);
        System.out.println("Private Field: " + a.getPrivateField());
    }
}
