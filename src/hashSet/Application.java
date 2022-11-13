package hashSet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(4);

        for(Integer values: hs)
        {
            System.out.println(values);
        }

        // Duplicate values will not be stored.
        // Hash set doesnt care about the order.

        HashSet<String> str = new HashSet<>();
        str.add("Prithviraj");
        str.add("prithviraj");

        // Hash set is not case-sensitive for strings
        // Here the order is not being maintained.
        
        // For maintaining the order we can use a linked hashset. Order means the order of insertion

        LinkedHashSet<Integer> HS = new LinkedHashSet<>();
        HS.add(1);
        HS.add(2);
        HS.add(3);
        HS.add(4);
        HS.add(4);
        HS.add(4);

        for (Integer s : HS)
        {
            System.out.println(s);
        }

        // Using a Hashset for own datatypes --> User created data types
        HashSet<Animals> a = new HashSet<>();
        a.add(new Animals("Tiger", 50));
        a.add(new Animals("Lion", 30));
        a.add(new Animals("Tiger", 50));

        for (Animals i: a) {
            System.out.println(i.toString());
        }

        Animals a1 = new Animals("Tiger", 50);
        Animals a2 = new Animals("Tiger", 50);

        HashSet<Animals> b = new HashSet<>();
        b.add(a1);
        b.add(a2);


        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        // This is not equal. Because the equals function is defined different
        // We need to override the equals function

    }
}

