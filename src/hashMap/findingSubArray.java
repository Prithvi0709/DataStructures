package hashMap;

import java.util.HashMap;

public class findingSubArray {
    public static void main(String[] args) {
        int[] a = {10,15,-5,15,-10,5};
        int sum = 5;

        subarray(a,sum);

    }

    public static void subarray(int[] a,int sum)
    {
        int currsum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i < a.length ; i++)
        {
            currsum = currsum+a[i];
            if(currsum == sum)
            {
                start = 0;
                end = i;
                break;
            }
            if(hs.containsKey(currsum-sum))
            {
                start = hs.get(currsum-sum) + 1;
                end = i;
                break;
            }
            hs.put(currsum,i);

        }
        if(end == -1) {
            System.out.println("Sum not found");
        }
        else {
            System.out.println(start);
            System.out.println(end);
        }

    }
}
