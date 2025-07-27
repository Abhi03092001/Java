import java.util.Stack;

public class day14task07 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Peek the top element without removing it
        if (!stack.isEmpty()) {
            String top = stack.peek();
            System.out.println("Top element (peek): " + top);
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

