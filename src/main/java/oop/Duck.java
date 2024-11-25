package oop;

public class Duck extends Animal implements Walkable, Flyable, Swimmable {

    public Duck(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Duck quacks");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
