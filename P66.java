import java.io.*;
import java.util.*;
public class P66
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
for(int i=0;i<len;i++)
{
int count=0;
for(int j=i+1;j<len;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
if(count==0)
{
System.out.println("element" + arr[i]);
}
}
}
}
