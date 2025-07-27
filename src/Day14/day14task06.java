
import java.util.Stack;

public class day14task06 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");

        System.out.println("Stack: " + stack);

        String value = "Banana";
        int position = stack.search(value);
        System.out.println("The  position  is " +position );

//        if (position == -1) {
//            System.out.println(elementToFind + " not found in the stack.");
//        } else {
//            System.out.println(elementToFind + " found at position " + position + " from the top.");
//        }
    }
}