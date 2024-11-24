package oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Duck duck = new Duck();

        ZooManager.displayAnimalActions(dog);
        ZooManager.displayAnimalActions(bird);
        ZooManager.displayAnimalActions(fish);
        ZooManager.displayAnimalActions(duck);
        ZooManager.feedAnimal(duck);
    }
}
