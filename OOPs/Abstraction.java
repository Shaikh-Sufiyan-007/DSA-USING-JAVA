public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
    }
}

abstract class Animal{
    String color;

    Animal() {                                                          // Contructor
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();                                               // Abstract method
}

class Horse extends Animal{
    void walk() {
        System.out.println("Horse walk on four legs...");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on two legs");
    }
}
