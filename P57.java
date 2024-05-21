import java.io.*;
import java.util.*;
public class P57
{
public static void main(String args[])
{
System.out.println("enter the lemgth of array");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr= new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<len;i++)
{
sum=sum+arr[i];
}
System.out.println("sum of array element is"+sum);
}
}