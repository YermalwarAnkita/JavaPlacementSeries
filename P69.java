import java.io.*;
import java.util.*;
public class P69
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
int count=0;
int count1=0;
for(int i=0;i<len;i++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]+"is even");
count++;
}
else
{
System.out.println(arr[i]+"is odd");
count1++;
}
}
System.out.println("given array contain"+count+"number of even element and"+count1+"odd element");
}
}