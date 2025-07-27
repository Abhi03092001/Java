import java.io.*;
import java.util.*;

public class task03 {
    public static void main(String[] args) {
        FileOutputStream outfile = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String s = scanner.nextLine();  // Read user input from the console
        byte[] b1 = s.getBytes();       // Convert to byte array

        try {
            outfile = new FileOutputStream("FileName02.txt");
            outfile.write(b1);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");

        // Close the scanner and output stream
        try {
            if (outfile != null)
                outfile.close();
        } catch (IOException e) {
            System.out.println("Error closing file: " + e);
        }

        scanner.close();
    }
}






