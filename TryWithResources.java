/*Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
Use try-with-resources to ensure the file is automatically closed after reading.
Handle any IOException that may occur. */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
