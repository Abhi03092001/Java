package HomeTask;

public class FactorialRecursive {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1; // base case
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;  // You can change this value
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
