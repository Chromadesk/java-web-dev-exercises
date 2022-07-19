package excercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Why write this entire paragraph when I can simply copy & paste it?
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(quote);
        System.out.println("Specify text to search for:");
        String search = input.nextLine();
        input.close();
        int searchIndex = quote.indexOf(search);
        if (quote.contains(search)) {
            System.out.println("Text found in quote at index " + searchIndex + ". Searched string is " +
                    search.length() + " characters long.");
            String modifiedSentence = quote.replace(search, "");
            System.out.println(modifiedSentence);
            return;
        }
        System.out.println("Text not found.");
    }
}
