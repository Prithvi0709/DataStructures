package hashMap;
//Questions
/*
    Find the largest subbarray with equal number of 1's and 0's in an array that has only 1's and 0's
*/
import java.util.HashMap;

public class largestSubbarraywithequalonesandzero {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,0,0};
        subbaray(a);
    }

    public static void subbaray(int[] a)
    {
        int currsum = 0;
        int sum = 0;
        int start = 0;
        int end = -1;
        int largest = 0;

        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == 0) a[i] = -1;
            currsum = currsum + a[i];

            if(currsum == sum)
            {
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(currsum))
            {
                start = map.get(currsum - sum) + 1;
                end = i;
                if (end-start + 1 > largest)
                {
                    largest = end - start + 1;
                }
                continue;
            }
            map.put(currsum,i);

        }
        if(end == -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(start);
            System.out.println(end);
            System.out.println(largest);
        }
    }
}
