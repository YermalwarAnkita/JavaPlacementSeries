import java.io.*;
import java.util.*;
	
public class PalindromeChek
{
public static int palinArray(int[] a, int n)
           {
               int arr[]=new int[n];
                  //add code here.
                  for(int i=0;i<n;i++)
                  {
                      int curr=arr[i];
                      
                      
                      int val=0;
                      
                      while(curr>0)
                      {
                          int d=curr%10;
                           val=val*10+curr;
                          curr=curr/10;
                      }
                      arr[i]=val;
                  }
                  for(int i=0;i<n;i++)
                  {
                      if(arr[i]!=a[i])
                      {
                          return 0;
                      }
                  }
                  return 1;
           }
public static void main(String args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int ans=palinArray(a,n);
System.out.println(ans);
}
}