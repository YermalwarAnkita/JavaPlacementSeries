import java.io.*;
import java.util.*;
public class P65
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
for(int j=0;j<len;j++)
{
if(arr[i]!=arr[j])
{
count++;
//System.out.println("non repeating element "+arr[i]);
}
}
if(count==len-1)
{
System.out.println("non repeating element "+arr[i]);
}
}
}
}