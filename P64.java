import java.io.*;
import java.util.*;
public class P64
{
public static void main(String args[])
{
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<len;i++)
{
for(int j=i+1;j<len;j++)
{
if(arr[i]==arr[j])
{
System.out.println("repeating element is:"+arr[i]);
break;
}
}
}
}
}