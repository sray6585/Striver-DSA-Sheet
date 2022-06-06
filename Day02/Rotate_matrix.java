import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int row=0,col=0;
        while(row<n && col<m)
        {
           
            if(row+1==n || col+1==m)
                break;
            int pre=mat.get(row+1).get(col);
            int cur;
            for(int i=col;i<m;i++)
            {
                cur=mat.get(row).get(i);
                mat.get(row).set(i,pre);
                pre=cur;
            }
            row++;
            for(int i=row;i<n;i++)
            {
                cur=mat.get(i).get(m-1);
                mat.get(i).set(m-1,pre);
                pre=cur;
            }
            m--;
            if(row<n)
            {
                for(int i=m-1;i>=col;i--)
                {
                    cur=mat.get(n-1).get(i);
                    mat.get(n-1).set(i,pre);
                    pre=cur;
                }
            }
            n--;
            if(col<m)
            {
                for(int i=n-1;i>=row;i--)
                {
                    cur=mat.get(i).get(col);
                    mat.get(i).set(col,pre);
                    pre=cur;
                }
            }
            col++;
        }
    }
}
