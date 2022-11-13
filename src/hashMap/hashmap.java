package hashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Jerry",12345);
        hm.put("John", 54321);
        hm.put("Prithvi", 56789);

        // Prints all the {key,value} pairs in the hashMap in no particular order
        System.out.println(hm);

        // Print the number of elements in the hashmap
        System.out.println(hm.size());

        // Used to check is the hashMap contains a key
        System.out.println(hm.containsKey("Jerry"));

        //Used to remove a key value pair in the hashMap
        hm.remove("Jerry");

        System.out.println(hm);
    }
}
