// Here's our final calculator.
// This incorporates elements of all we've learned
// up to this point, including if statements, loops and function.
import java.util.Scanner;
import java.util.ArrayList;

public class FinalCalculator {
    // Function that returns the sum
    // Note static (function, not object method)
    // and double return type
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static ArrayList<String> thanos(ArrayList<String> people) {
        int targetLength = people.size() / 2;

        while (people.size() > targetLength) {
            int randomPerson = (int) (Math.random() * people.size());
            System.out.println(people.get(randomPerson) + " was snapped");
            people.remove(randomPerson);
        }

        return people;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We'll use an infinite loop so that the user doesn't
        // have to restart the program every time they want
        // to enter something new
        while (true) {
            // Prompt (no newline)
            System.out.print("Enter an operation (or quit): ");
            String op = scanner.nextLine();

            if (op.equals("quit")) {
                // If the user typed quit, quit
                // Breaks us out of the loop
                break;
            } else if (op.equals("thanos")) {
                // Ask for 5 names
                ArrayList<String> people = new ArrayList<String>();
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter a person: ");
                    people.add(scanner.nextLine());
                }

                System.out.println(thanos(people));
            } else {
                // Pretty self explanatory
                System.out.print("Enter a number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter another number: ");
                double num2 = scanner.nextDouble();

                if (op.equals("+")) {
                    System.out.println(add(num1, num2));
                } else if (op.equals("-")) {
                    System.out.println(sub(num1, num2));
                } else if (op.equals("*")) {
                    System.out.println(mult(num1, num2));
                } else if (op.equals("/")) {
                    System.out.println(div(num1, num2));
                } else {
                    System.out.println("Not a valid operation!");
                }
            }
        }

        System.out.println("Bye!");
    }
}
