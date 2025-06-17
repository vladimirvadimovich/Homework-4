public class Mouse extends Animal implements AnimalBehavior {
    public Mouse(String pet, String name, int age, double weight, String color, boolean isDomestic) {
        super(pet, name, age, weight, color, isDomestic);
    }

    public void makeSound() {
        System.out.println(this.name + " пищит.");
    }

    public void eat() {
        System.out.println(this.name + " ест сыр.");
    }

    public void sleep() {
        System.out.println(this.name + " спит в норе.");
    }
}
