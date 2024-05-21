import java.io.*;
import java.util.*;
public class PrefixSum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
System.out.println("enter the elements of array");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
if(i==0)
{
arr[i]=arr[i];}
else
{
arr[i]=arr[i-1]+arr[i];
}
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}