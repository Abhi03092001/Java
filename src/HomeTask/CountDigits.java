package HomeTask;

import java.util.Scanner;

public class CountDigits {

        // Recursive function to count digits
        public static int countDigits(int num) {
            if (num == 0)
                return 0;
            return 1 + countDigits(num / 10);
        }

        // Recursive function to sum digits
        public static int sumDigits(int num) {
            if (num == 0)
                return 0;
            return (num % 10) + sumDigits(num / 10);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else if (number == 0) {
                System.out.println("Number of digits: 1");
                System.out.println("Sum of digits: 0");
            } else {
                System.out.println("Number of digits: " + countDigits(number));
                System.out.println("Sum of digits: " + sumDigits(number));
            }

            sc.close();
        }
    }
