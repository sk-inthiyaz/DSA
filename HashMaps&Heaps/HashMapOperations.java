
import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. put(key, value) → Insert or update
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        map.put("banana", 4); // This will update "banana" value to 4

        // 3. get(key) → Get value for key
        System.out.println("Value for key 'banana': " + map.get("banana")); // 4

        // 4. containsKey(key)
        System.out.println("Contains key 'apple': " + map.containsKey("apple")); // true
        System.out.println("Contains key 'grapes': " + map.containsKey("grapes")); // false

        // 5. containsValue(value)
        System.out.println("Contains value 5: " + map.containsValue(5)); // true

        // 6. remove(key)
        map.remove("orange");
        System.out.println("After removing 'orange': " + map);

        // 7. size()
        System.out.println("Size of HashMap: " + map.size());

        // 8. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 9. getOrDefault(key, default)
        System.out.println("Get 'grapes' or default: " + map.getOrDefault("grapes", 0)); // 0

        // 10. keySet() → Get all keys
        System.out.println("All keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 11. values() → Get all values
        System.out.println("All values:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // 12. entrySet() → Loop through key-value pairs
        System.out.println("All entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 13. clear() → Remove all entries
        map.clear();
        System.out.println("After clearing map: " + map); // {}
    }
}

//put,get,contains
class Hashmaps{
    public static void main(String[] args) {
     HashMap<String,Integer>hm = new HashMap<>();
     hm.put("India",135);
     hm.put("China",200);
     hm.put("Pak",20);
     hm.put("US",20);
     hm.put("UK",10);
     System.out.println(hm);
     hm.put("Nigeria",5);
     hm.put("US",25);
     System.out.println(hm);
    System.out.println(hm.get("India"));
    System.out.println(hm.get("Utoopia"));

    System.out.println(hm.containsKey("India"));
    System.out.println(hm.get("Utoopia"));

    Set<String>Keys = hm.keySet();
    System.out.println(Keys);
    for(String key:hm.keySet()){
        Integer val = hm.get(key);
        System.out.println(key + " "+ val
        );
    }
    }
}