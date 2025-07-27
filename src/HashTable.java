import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 103);
        // use  get method of Ht
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());


        //buy using get method
        System.out.println("Buy using get method----------- ");

        System.out.println("Anitha: " + ht.get("Anitha"));
        System.out.println("Kavitha: " + ht.get("Kavitha"));
        System.out.println("Meera: " + ht.get("Meera"));
    }
}
