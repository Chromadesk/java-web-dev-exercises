package studios.areaofcircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        input.close();
        System.out.println("The area of the circle is " + Circle.getArea(radius));
    }
}