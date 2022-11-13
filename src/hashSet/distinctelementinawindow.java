package hashSet;

/*
    Find the distinct elements that are present in a given window.
    a[] = [1,2,2,1,3,1,1,3]
    k = 4;

 */

import java.util.HashMap;

public class distinctelementinawindow {
    public static void main(String[] args) {
        int[] a = {1,2,2,1,3,1,1,3};
        int k = 4;
        distinct(a,k);
    }
    /*
                Algo --> Kinda

                //insert element
                    Check if that element is present before
                        true : increment key value
                        false


             */
    public static void distinct(int[] a, int k)
    {
        int start = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++)
        {
               if(map.containsKey(a[i]))
               {
                   int temp = map.get(a[i]);
                   temp+=1;
                   map.put(a[i],temp);
               }
               else
               {
                   map.put(a[i],1);
               }
        }
        System.out.println(map.size());

        for (int i = k; i < a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                int temp = map.get(a[i]);
                temp+=1;
                map.put(a[i],temp);
            }
            else {
                map.put(a[i], 1);
            }

            if(map.containsKey(a[i-k]))
            {
                    int temp = map.get(a[i-k]);
                    temp-=1;

                    if(temp == 0)
                    {
                        map.remove(a[i-k]);
                    }
                    else
                    {
                        map.put(a[i-k],temp);
                    }
            }

            System.out.println(map.size());

        }



    }
}
