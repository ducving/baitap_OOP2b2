package animal1;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }

    @Override
    public String howToEat() {
        return "mouth";
    }
}