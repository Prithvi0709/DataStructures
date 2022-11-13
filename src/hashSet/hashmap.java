package hashSet;
import java.util.HashSet;
import java.util.Iterator;

public class hashmap {
    public static void main(String[] args)
    {
        HashSet<Integer> hash = new HashSet<Integer>();

        //Adding values to the hashset
        hash.add(10);
        hash.add(11);

        //Checking if the value is present
        if(hash.contains(10)) System.out.println("Present");

        System.out.println(hash.contains(10));

        //Used to iterate a hashset
            //An object from class Iterator is used.
        Iterator<Integer> a = hash.iterator();
        System.out.println(a.next());
        System.out.println(a.next());

            //Directly print using the hashset object
        System.out.println(hash);

        // Used to check if the hashset is empty
        System.out.println(hash.isEmpty());

        //Used to print the size of the hashset
        System.out.println(hash.size());
    }
}
