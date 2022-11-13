package hashSet;

import java.util.HashSet;

public class distinctElement {
    public static void main(String[] args) {
        int[] a = {1,1,3,4,5,10};
        int[] b = {1,5,6,4,7};

        distinctElement d = new distinctElement();
        d.countDistinct(a);
        d.intersection(a,b);

    }
    public void countDistinct(int[] a) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int element:a) {
            hs.add(element);
        }

        System.out.println(hs.size());

        /*  HASHSET ONLY ALLOWS THE STORAGE OF DISTINCT VALUES --> BECAUSE HASHSET USES HASHMAP UNDERNEATH AND VALUES ARE STORED
                                                                    IN POSITION OF THE KEYS. THE VALUE HOLDS A DUMMY OBJECT

         */
    }

    public void intersection(int[] a, int[] b)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        int count = 0;

        for (int element:a) {
            hs.add(element);
        }

        for (int element:b) {
            if(hs.contains(element))
            {
                hs.remove(element);
                count++;
            }
        }
        System.out.println(hs.size()); 
        System.out.println(count);
    }

}
