/*Create a Java program that performs array operations.
Accept an integer array and an index number.
Retrieve and print the value at that index.
Handle the following exceptions:
ArrayIndexOutOfBoundsException if the index is out of range.
NullPointerException if the array is null. */


import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index number: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}
