package chapter1;
import java.util.Scanner;


public class InputAndArithmetic {
    public static void main(String[] args) {

        float numOne; 
        float numTwo;
        float result;

        Scanner s = new Scanner(System.in);
       
        System.out.println("First Number = ");
        numOne = s.nextFloat();

        System.out.println("Second Number = ");
        numTwo = s.nextFloat();

        result = numOne * numTwo;

        System.out.println();
        System.out.println(numOne + "*" + numTwo + "=" + result);

    }   
}
