public abstract class Animal {
    protected String pet;
    protected String name;
    protected int age;
    protected double weight;
    protected String color;
    protected boolean isDomestic;

    public Animal(String pet, String name, int age, double weight, String color, boolean isDomestic) {
        this.pet = pet;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isDomestic = isDomestic;
    }

    public void info() {
        System.out.println("Вид питомца: " + this.pet);
        System.out.println("Кличка: " + this.name);
        if (this.age >= 5) {
            System.out.println("Возраст: " + this.age + " лет");
        } else if (this.age > 1) {
            System.out.println("Возраст: " + this.age + " года");
        } else {
            System.out.println("Возраст: " + this.age + " год");
        }

        double var10001 = this.weight;
        System.out.println("Вес: " + var10001 + " кг");
        String var1 = this.color;
        System.out.println("Окрас: " + var1);
        System.out.println("Домашнее: " + (this.isDomestic ? "да" : "нет"));
    }
}
