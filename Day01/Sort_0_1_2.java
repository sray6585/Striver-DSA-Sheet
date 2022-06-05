import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n=arr.length;
        int one=0,zero=0,two=n-1;
        while(one<=two)
        {
            if(arr[one]==0)
            {
                swap(zero++,one++,arr);
            }
            else if(arr[one]==2)
            {
                swap(one,two--,arr);
            }
            else
                one++;
        }
    }
    public static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}