package oop;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
