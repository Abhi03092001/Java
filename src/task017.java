import java.util.*;
import java.util.stream.Collectors;

public class task017 {
    public static void main(String[] args) {
        // List with duplicate names
        List<String> names = Arrays.asList("Amit", "Sneha", "Rahul", "Sneha", "Amit", "Priya");

        System.out.println("Original List:");
        System.out.println(names);

        // Stream to remove duplicates and apply map (e.g., convert to uppercase)
        List<String> uniqueNames = names.stream()
                .distinct()                         // Removes duplicates
                .map(name -> name.toUpperCase())    // Optional transformation using map()
                .collect(Collectors.toList());

        System.out.println("\nList after removing duplicates and applying map:");
        System.out.println(uniqueNames);
    }
}
