public class Dog extends Animal implements AnimalBehavior {
    public Dog(String pet, String name, int age, double weight, String color, boolean isDomestic) {
        super(pet, name, age, weight, color, isDomestic);
    }

    public void makeSound() {
        System.out.println(this.name + " лает.");
    }

    public void eat() {
        System.out.println(this.name + " ест кости.");
    }

    public void sleep() {
        System.out.println(this.name + " спит в будке.");
    }
}