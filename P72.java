import java.io.*;
import java.util.*;
public class P72
{
public static void main(String args[])
{
System.out.println("enter the size of array1");
Scanner sc=new Scanner(System.in);
int len1=sc.nextInt();
System.out.println("enter the size of array2");
int len2=sc.nextInt();
int[] arr1=new int[len1];
int[] arr2=new int[len2];
for(int i=0;i<len1;i++)
{
arr1[i]=sc.nextInt();
}
for(int i=0;i<len2;i++)
{
arr2[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<len1;i++)
{
for(int j=0;j<len2;j++)
{
if(arr1[i]==arr2[j])
{
count++;
}
}
}
if(count==0)
{
System.out.println("sets are disjoint");
}
else
{
System.out.println("sets are not disjoint");
}
}
}