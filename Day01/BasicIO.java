import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // String (single word) input
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println("You entered: " + word);

        sc.nextLine(); // consume leftover newline before nextLine()

        // Full line input
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        System.out.println("You entered: " + line);

        sc.close(); // always close scanner
    }
}
