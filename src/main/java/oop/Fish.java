package oop;

public class Fish extends Animal implements Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Fish makes no sound");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
