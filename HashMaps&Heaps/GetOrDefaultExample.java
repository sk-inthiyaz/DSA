/*
Here is a basic question to practice getOrDefault in Java:
You have a list of fruits, and you want to count how many times each fruit appears. Write a program that uses a Map and the getOrDefault method to count the frequency of each fruit in the list.
Fruit Lis
List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana", "apple");
Expected Output
{apple=3, banana=2, orange=1, grape=1}

import java.util.*;

public class GetOrDefaultExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana", "apple");
        
        // Use LinkedHashMap to preserve insertion order
        Map<String, Integer> hm = new LinkedHashMap<>(); 
        
        for(String fruit : fruits){
            hm.put(fruit, hm.getOrDefault(fruit, 0) + 1);
        }
        
        System.out.println(hm);
    }
}

 */

// To preseve in the same order we use LinkedHashMap<>()
import java.util.*;
public class GetOrDefaultExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana", "apple");
        HashMap<String,Integer> hm = new HashMap<>();
        for(String fruit:fruits){
            hm.put(fruit,hm.getOrDefault(fruit, 0)+1);
        }
        System.out.println(hm);
    }
}