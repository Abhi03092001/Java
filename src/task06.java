import java.io.*;

class task06 {
    public static void main(String[] args) {
        try {
            FileInputStream infile = new FileInputStream("FileName01.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");

            int byteread;  // use int to correctly compare with -1 (EOF)

            // Read and write bytes until end of file
            while ((byteread = infile.read()) != -1) {
                outfile.write(byteread);
            }

            infile.close();
            outfile.close();

            System.out.println("Byte copied from NewFile01.txt to NewFile05.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


