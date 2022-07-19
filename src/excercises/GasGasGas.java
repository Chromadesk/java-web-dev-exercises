package excercises;
import java.util.Scanner;

public class GasGasGas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int odometer = input.nextInt();
        System.out.println("How many gallons of gas have been consumed?");
        int gas = input.nextInt();
        input.close();
        System.out.println("Your car gets " + odometer / gas + " miles per gallon.");

    }


}
