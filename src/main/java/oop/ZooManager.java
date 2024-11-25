package oop;

import org.jetbrains.annotations.NotNull;

public class ZooManager {
    static void displayAnimalActions(Animal animal) {
        if (animal instanceof Flyable) {
            ((Flyable) animal).fly();
        }
        if (animal instanceof Walkable) {
            ((Walkable) animal).walk();
        }
        if (animal instanceof Swimmable) {
            ((Swimmable) animal).swim();
        }
        animal.makeSound();
    }

    static void feedAnimal(@org.jetbrains.annotations.NotNull Animal animal) {
        String name = animal.getName() == null ? "Unknown" : animal.getName();
        String type = animal.getClass().getSimpleName();
        System.out.println("Feeding " + name + " the " + type);
    }
}
