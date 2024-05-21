import java.io.*;
import java.util.*;
public class P58
{
public static void main(String args[])
{
System.out.println("enter array length");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
int temp;
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<len/2;i++)
{
temp=arr[i];
arr[i]=arr[len-i-1];
arr[len-i-1]=temp;
}
System.out.println("reverse string is:");
for(int i=0;i<len;i++)
{
System.out.println(" "+arr[i]);
}
}
}