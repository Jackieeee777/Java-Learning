import java.util.Scanner;
public class DAY02Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("Result:" + (num1 * num2));
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
            } else {
            System.out.println("Result: " + (num1 / num2));
            }
        } else {
            System.out.println("Error: Invalid operation!");
        }

        sc.close();
    }
}
