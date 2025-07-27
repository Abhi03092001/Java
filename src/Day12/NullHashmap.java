import java.util.HashMap;

public class NullHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put(null, 100);           // null key with a non-null value
        map.put("Anitha", null);      // non-null key with null value
        map.put("Kavitha", 102);
        map.put("savita", null);



        System.out.println("Value for null key: " + map.get(null));
        System.out.println("Value for Anitha: " + map.get("Anitha"));
        System.out.println("Value for Kavitha: " + map.get("Kavitha"));
        System.out.println("Value for savita: " + map.get("savita"));


//        System.out.println("All entries:");
//        for (String key : map.keySet()) {
//            System.out.println(key + ": " + map.get(key));
        }
    }


