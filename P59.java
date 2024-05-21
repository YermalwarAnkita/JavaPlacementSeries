import java.io.*;
import java.util.*;
public class P59
{
public static void main(String args[])
{
System.out.println("enter length of array");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("element in array is :");
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}
int s;
for(int i=0;i<len/2;i++)
{
 for(int j=i;j<len/2;j++)
{
if(arr[i]>arr[j])
{
s=arr[i];
arr[i]=arr[j];
arr[j]=s;
}
}
}
System.out.println("\nsort half part of array by assending ");
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}

int k;
for(int i=len/2;i<len;i++)
{
 for(int j=i;j<len;j++)
{
if(arr[i]<arr[j])
{
k=arr[i];
arr[i]=arr[j];
arr[j]=k;
}
}
}

System.out.println("\n sort half part of array by decending ");
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}
}
}