import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 !=0)
                .collect(Collectors.toList());

        System.out.println("Odd numbers: " + oddNumbers);

        scanner.close();
    }
}

