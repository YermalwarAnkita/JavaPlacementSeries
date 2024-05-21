import java.io.*;
import java.util.*;
public class Pairs
{
 public static int maxSumPairWithDifferenceLessThanK(int arr[], int n, int K) 
    {
       
 int sum=0;
        Arrays.sort(arr);
        for(int i=n-1;i>0;i=i-1)
        {
            
            if(Math.abs((arr[i]-arr[i-1]))<K)
            { 
                 System.out.println("sum = "+sum+" 1   "+arr[i]+"  2    "+arr[i-1]);
                sum=sum+arr[i]+arr[i-1];
                arr[i]=Integer.MAX_VALUE;
                arr[i-1]=Integer.MAX_VALUE;
            }
        }
        return sum;
    }
    
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int ans=maxSumPairWithDifferenceLessThanK( arr, n ,k);
System.out.println(ans);
}
}