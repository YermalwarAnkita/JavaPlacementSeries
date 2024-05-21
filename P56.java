import java.io.*;
import java.util.*;
public class P56
{
public static void main(String args[])
{
System.out.println("enter the length of array");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("element in an array");
for(int i=0;i<len;i++)
{
System.out.println(" "+arr[i]);
}
int high=arr[0];
int small=arr[0];

for(int i=0;i<len;i++)
{
if(arr[i]<small)
{
small=arr[i];
}

if(arr[i]>high)
{
high=arr[i];
}
}
System.out.println("highest element in an array is :"+high);
System.out.println("smallest element in an array is :"+small);
}
}

