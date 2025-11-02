// sample file
package chapter1;


import java.util.*;


public class Main {
      public static void main(String[] args) {
        // create and instance of a Toy class = Toy Object

       /*  this
        * is a 
        * multiline
        * comment
*/
        Toy toy1 =  new Toy ();
        toy1.name = "Rage Pink";
        toy1.brand = "Hello Kitty";
        toy1.price = 2000;
        toy1.quantity = 12; 
        System.out.println();
        Random r = new Random ();
        System.out.println(r.nextInt(100));
        ArrayList al = new ArrayList<>();
        Date date1 = new Date();
    }
}