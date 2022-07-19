package excercises;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Rectangle Calculator.");
        System.out.println("What is the rectangle's length?");
        double rectLength = input.nextDouble();
        System.out.println("What is the rectangle's width?");
        double rectWidth = input.nextDouble();
        input.close();
        System.out.println("The area of the rectangle is " + rectLength * rectWidth);
    }
}
