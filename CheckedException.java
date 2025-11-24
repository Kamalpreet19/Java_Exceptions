//Create a Java program that reads a file named "data.txt". If the file does not exist, 
// handle the IOException properly and display a user-friendly message.

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("File Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
