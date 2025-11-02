package chapter1;
/**
 *  Toy Object 
 * has property of name, brand, price, quantity
 * with a method of setPrice() where you can change
 * the price state of Toy Oject,
 */

public class  Toy {
    String name;
    String brand;
    double price;
    int quantity; 

    void setPrice (double price){
        this.price = price;
    }
    public static void main(String[] args) {
        Toy toy1 =  new Toy ();
        toy1.name = "Rage Pink";
        toy1.brand = "Hello Kitty";
        toy1.price = 2500;
        toy1.quantity = 12;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);
    }
}
class Fruit {

}
class Fruit2 {

}

class Fruit3 {

}

class Fruit4 {
    public static void main(String[] args) {
        System.out.println("I am Fruit 4");
        Fruit3 f3 = new Fruit3 ();
    }

}
