import java.util.stream.Stream;

public class task019 {
    public static void main(String[] args) {
        // Create a stream of integers from 1 to 20
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Skip first 15 numbers
        Stream<Integer> skipNums = nums.skip(15);

        // Print remaining numbers using forEach
        skipNums.forEach(System.out::println);
    }
}

