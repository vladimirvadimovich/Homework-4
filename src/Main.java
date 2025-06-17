//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog("Собака", "Шарик", 5, (double)30.0F, "чёрный", true);
        Cat barsik = new Cat("Кот", "Барсик", 3, (double)4.5F, "рыжий", true);
        Mouse ratatuy = new Mouse("Мышь", "Рататуй", 1, (double)0.5F, "белый", false);
        sharik.info();
        sharik.makeSound();
        sharik.eat();
        sharik.sleep();
        System.out.println();
        barsik.info();
        barsik.makeSound();
        barsik.eat();
        barsik.sleep();
        System.out.println();
        ratatuy.info();
        ratatuy.makeSound();
        ratatuy.eat();
        ratatuy.sleep();
    }
}
