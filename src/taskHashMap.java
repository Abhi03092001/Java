import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class taskHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> ht = new HashMap<>();
        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 103);

        // Iterate over entries
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        // Using get method
        System.out.println("Using get method----------- ");
        System.out.println("Anitha: " + ht.get("Anitha"));
        System.out.println("Kavitha: " + ht.get("Kavitha"));
        System.out.println("Meera: " + ht.get("Meera"));
    }
}


