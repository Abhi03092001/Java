import java.io.*;

class task05 {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("FileName03.txt");  // Open file for reading
            int ch;

            // Read characters one at a time until end of file (-1)
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);  // Print the character
            }

            System.out.println("\nReading complete");  // After reading is done
            fr.close();  // Close the file
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}



