import java.io.*;

public class task04 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("FileName03.txt");
            fw.write("ahmedabad\n");
            fw.write("baroda\n");
            fw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Write operations done!!");
    }
}


