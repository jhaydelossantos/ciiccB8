package chapter2;
import java.util.Scanner;



public class ConditionalStatement {
    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Math : ");
        float mathGrade = s.nextFloat();

        System.out.println("Science : ");
        float scienceGrade = s.nextFloat();

        System.out.println("English : ");
        float englishGrade = s.nextFloat();

        System.out.println("TLE : ");
        float tleGrade = s.nextFloat();

        float average = (mathGrade + scienceGrade + englishGrade + tleGrade) / 4;

        System.out.println();
        System.out.println("Averarage : " + average);

        if (average >100) System.out.println("Invalid Grade");
        else if (average >=98) System.out.println("With Highest Honors");
        else if(average >=95) System.out.println("With High Honors");
        else if (average >90) System.out.println("With Honors");
        else if (average >=75) System.out.println("Passed");
        else System.out.println("Failed");

        }
70
    }
    
    

