import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashWithsyn {
    public static void main(String[] args) {
        // Create a normal HashMap
        HashMap<String, Integer> hm1 = new HashMap<>();

        // Make it synchronized using the hint
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);

        // Add entries
        syncMap.put("Anitha", 101);
        syncMap.put("Kavitha", 102);
        syncMap.put("Meera", 103);

        // Safely access entries
        System.out.println("Using synchronized map:");
        synchronized (syncMap) { // Required for safe iteration
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

