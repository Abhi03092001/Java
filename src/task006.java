import java.io.*;

class task006 {
    public static void main(String[] args) {
        try {
            FileInputStream infile = new FileInputStream("FileName01.txt");  // Input stream for reading
            FileOutputStream outfile = new FileOutputStream("NewFile05new.txt");  // Output stream for writing

            int byteread;  // Variable to hold each byte read

            // Read byte-by-byte and write it
            while ((byteread = infile.read()) != -1) {
                outfile.write(byteread);
            }

            infile.close();  // Close input stream
            outfile.close();  // Close output stream

            System.out.println("Byte copied from NewFile01.txt to NewFile05.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

