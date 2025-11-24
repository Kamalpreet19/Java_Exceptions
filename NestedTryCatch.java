/*Write a Java program that:
Takes an array and a divisor as input.
Tries to access an element at an index.
Tries to divide that element by the divisor.
Uses nested try-catch to handle:
ArrayIndexOutOfBoundsException if the index is invalid.
ArithmeticException if the divisor is zero. */


import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};  

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            try {
                int value = arr[index];  

                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                int result = value / divisor;  
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
