import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Add
        map.put("Suraj", 90);
        map.put("Aman", 80);
        map.put("Rohan", 85);

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println();

        // Update
        map.put("Rohan", 70);

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println(); 

        System.out.println(map.get("Suraj"));

        System.out.println();

        map.remove("Aman");

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}