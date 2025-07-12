
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
 
        // Adding 10 key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");
        map.put(6, "Fig");
        map.put(7, "Grapes");
        map.put(8, "Honeydew");
        map.put(9, "Indian Fig");
        map.put(10, "Jackfruit");

        // get()
        System.out.println("Get value with key 5: " + map.get(5));

        // containsKey() and containsValue()
        System.out.println("Contains key 7? " + map.containsKey(7));
        System.out.println("Contains value 'Date'? " + map.containsValue("Date"));

        // remove()
        map.remove(3);

        // size()
        System.out.println("Size of HashMap: " + map.size());

        // isEmpty()
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Print using entrySet()
        System.out.println("\nPrinting using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Print using keySet()
        System.out.println("\nPrinting using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
