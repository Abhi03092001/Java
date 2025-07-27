package HomeTask;

import java.util.Scanner;

public class DecimalToBinary {

    public static void convertToBinary(int n) {
        if (n == 0) return;
        convertToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        System.out.print("Binary of " + number + " is: ");
        if (number == 0)
            System.out.print("0");
        else
            convertToBinary(number);

        System.out.println();
        sc.close();
    }
}

