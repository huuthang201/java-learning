package oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        Bird bird = new Bird("Tweety", 2);
        Fish fish = new Fish("Goldie", 1);
        Duck duck = new Duck("Donald", 3);

        ZooManager.displayAnimalActions(dog);
        ZooManager.displayAnimalActions(bird);
        ZooManager.displayAnimalActions(fish);
        ZooManager.displayAnimalActions(duck);
        ZooManager.feedAnimal(duck);
    }
}
