/** Space O(1) and Time complexity O(n) */


import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit=0,min=Integer.MAX_VALUE;
        for(int val:prices)
        {
            
            if(val-min>maxProfit)
            {
                maxProfit=val-min;
            }
            if(val<min)
                min=val;
        }
        return maxProfit;
    }
}

