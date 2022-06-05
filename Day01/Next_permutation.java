import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int n=permutation.size();
        int i=n-2;
        while(i>=0 && permutation.get(i)>=permutation.get(i+1))
            i--;
        if(i>=0)
        {
            int j=n-1;
            while(permutation.get(j)<=permutation.get(i))
                j--;
            permutation=swap(permutation,i,j);
            
        }
        return reverse(permutation,i+1,n-1);
	}
    public static ArrayList<Integer> swap(ArrayList<Integer> permutation,int i,int j)
    {
        int temp=permutation.get(i);
        permutation.set(i,permutation.get(j));
        permutation.set(j,temp);
        return permutation;
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> permutation,int i,int j)
    {
        while(i<j)
        {
            permutation=swap(permutation,i++,j--);
        }
        return permutation;
    }
    
}
