import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task012 {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use stream map() to get squares
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Original numbers :" + numbers);
        System.out.println("the squares of the number :" + squares);
    }
}