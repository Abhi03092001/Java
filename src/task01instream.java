import java.io.*;

public class task01instream {
    public static void main(String args[]) {
        File f1 = new File("FileName01.txt");
        byte Text[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        // Using try-with-resources to ensure the stream is closed after use
        try (FileOutputStream outfile = new FileOutputStream(f1)) {
            outfile.write(Text);
            System.out.println("Write Byte");
            System.out.println("Thank You...!!!");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);  // Exiting with error code -1
        }
    }
}



