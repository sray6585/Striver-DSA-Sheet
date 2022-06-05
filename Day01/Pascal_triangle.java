/* space complexity O(1) as no extra space taken except the one which is used to return and time complexity o(n*n) */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> ans=new ArrayList<>();
        ArrayList<Long> row,pre=null;
        for(int i=0;i<n;i++)
        {
            row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    row.add(new Long(1));
                else
                    row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            ans.add(row);
        }
        return ans;
	}
}
