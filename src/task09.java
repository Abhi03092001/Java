import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {

        String original = "Hello";

//        String reversed = "";
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reversed += original.charAt(i);
//        }


        // Reverse using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Reversed string: " + reversed);


    }
}