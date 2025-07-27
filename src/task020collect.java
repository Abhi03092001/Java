import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task020collect {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum using collect (via summingInt)
        int sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of all elements: " + sum);

        // Max using collect (via maxBy)
        int max = numbers.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Integer::compareTo),
                        opt -> opt.orElse(0)
                ));
        System.out.println("Maximum element: " + max);

        // String concatenation using joining
        List<String> strings = Arrays.asList("Hello", " ", "world", "!");
        String concatenatedString = strings.stream()
                .collect(Collectors.joining());
        System.out.println("Concatenated string: " + concatenatedString);
    }
}


