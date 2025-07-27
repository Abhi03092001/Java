import java.util.Stack;

public class day14task08 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is NOT empty.");
        }


    }
}
