package Animal;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();  
        Dog dog = new Dog();
        Cow cow = new Cow();      
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
