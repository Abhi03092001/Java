import java.util.stream.Stream;

public class task018 {
    public static void main(String[] args) {
        // Create a stream of integers from 1 to 20
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20); // Generate 1 to 20

        // Limit to first 10 and print them
        nums
                .limit(10)
                .forEach(System.out::println);
    }
}

