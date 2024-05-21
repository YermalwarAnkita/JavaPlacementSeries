import java.io.*;
import java.util.*;
public class P91
{
public static void main(String args[])
{
System.out.println("enter length of 1st and 2nd array");
Scanner sc=new Scanner(System.in);
int l1=sc.nextInt();
int l2=sc.nextInt();
int[] arr=new int[l1];
int[] arr2=new int[l2];
System.out.println("enter element of 1st array");
for(int i=0;i<l1;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter element of 2nd array");
for(int i=0;i<l2;i++)
{
arr2[i]=sc.nextInt();
}
if(arr==arr2)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
}
}