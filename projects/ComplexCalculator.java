// Note that you need to **import** Scanner before using it
import java.util.Scanner;

public class ComplexCalculator {
    public static void main() {
        // We get inputs like this:
        Scanner scanner = new Scanner(System.in);
        // scanner.nextInt() will give us an integer...
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        // and scanner.nextLine() will give us a string
        String op = scanner.nextLine();

        // Now we can use if statements to decide what to do
        // (note: for more advanced students, you may want to also
        // teach switch)
        //
        // Note the use of .equals() to compare Strings in Java
        if (op.equals("+")) {
            // If op is +, print sum
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            // And so on
            System.out.println(num1 - num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            // Here's a catch all
            System.out.println("Operation not valid!");
        }

        // The same thing, with switch syntax:
        // for an example like this (comparing the value of one variable)
        // you will want to use switch syntax because it's faster and more concise
        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                // Note the use of break after case is finished
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                // Default branch
                System.out.println("Operation not valid!");
                break;
        }
    }
}
