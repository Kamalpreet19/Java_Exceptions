//Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
//ArithmeticException if division by zero occurs.
//InputMismatchException if the user enters a non-numeric value

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only!");
        }
        finally {
            sc.close();
        }
    }
}
