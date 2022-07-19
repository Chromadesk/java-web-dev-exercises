package excercises;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your first name?");
        String firstName = input.nextLine();
        System.out.println("How about your last name?");
        String lastName = input.nextLine();
        input.close();
        System.out.println("Hello " + firstName + " " + lastName);

    }
}
