import java.io.*;
import java.util.*;
public class P54
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
for(int i=0;i<len;i++)
{
System.out.println("element in array :"+arr[i]);
}
int small=arr[0];
for(int i=0;i<len;i++)
{
if(arr[i]<small)
{
small=arr[i];
}
}

System.out.println("small element in array :"+small);
Arrays.sort(arr);
System.out.println("second small element in array :"+arr[1]);
}
}