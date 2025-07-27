import java.util.LinkedList;



public class Transverse {
        public static void main(String[] args){
            LinkedList<String> list = new LinkedList<>();

            list.add("Apple");
            list.add("mango");
            list.add("banana");
            list.add("Grapes");

            System.out.println("Transverseing the list");
            for (String item : list){
                System.out.println(item);

            }

        }
}
