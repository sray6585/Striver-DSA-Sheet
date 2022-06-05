/* way one space complexity O(n) and time complexity O(mn) */


/* 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int m=matrix.length;
        int n=matrix[0].length;

        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(row[i]==-1 || col[j]==-1)
                {
                    matrix[i][j]=0;
                }
          
            }

        }

    }

}

*/

/** optimized way space complexity O(1) and time complexity O(mn) */


import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int m=matrix.length;
        int n=matrix[0].length;
        int col0=0;
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
                col0=1;
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
            if(col0==1)
                matrix[i][0]=0;

        }

    }

}