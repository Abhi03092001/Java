import java.util.Stack;

public class day14task04{
        public static void main(String[] args) {
            // Create a stack of Strings
            Stack<String> stack = new Stack<>();

            // Push elements onto the stack
            stack.push("Apple");
            stack.push("Banana");
            stack.push("Cherry");

            System.out.println("Stack before popping: " + stack);

            // Pop the top element
            String poppedElement = stack.pop();

            // Print the popped element
            System.out.println("Popped element: " + poppedElement);

            // Print the stack after popping
            System.out.println("Stack after popping: " + stack);
        }
    }
