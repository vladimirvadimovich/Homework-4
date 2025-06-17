public class Cat extends Animal implements AnimalBehavior {
    public Cat(String pet, String name, int age, double weight, String color, boolean isDomestic) {
        super(pet, name, age, weight, color, isDomestic);
    }

    public void makeSound() {
        System.out.println(this.name + " мяукает.");
    }

    public void eat() {
        System.out.println(this.name + " ест рыбу.");
    }

    public void sleep() {
        System.out.println(this.name + " спит на диване.");
    }
}