package oop;

public class Dog extends Animal implements Walkable {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    public void describe() {
        System.out.println("Description of Dog");
        this.makeSound();
        super.eat();
    }
}
