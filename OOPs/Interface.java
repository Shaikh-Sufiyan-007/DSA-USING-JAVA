public class Interface {
    public static void main(String[] args) {
        Beer b = new Beer();
        b.eatMeat();
        b.eatVeg();
    }
}


interface Carnovorous{
    void eatMeat();
}

interface Herbivorous{
    void eatVeg();
}

class Beer implements Carnovorous , Herbivorous {
    public void eatMeat() {
        System.out.println("Beer eats meat");
    }
    
    public void eatVeg() {
        System.out.println("Beer eats Vegitables");
    }
}