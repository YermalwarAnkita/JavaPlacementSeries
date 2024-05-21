import java.io.*;
import java.util.*;
public class P61
{
public static void main(String args[])
{
System.out.println("enter the length of array");
Scanner  sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
int[] count=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("\n element in array \n");
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}
for(int i=0;i<len;i++)
{
for(int j=0;j<len;j++)
{
if(arr[i]==arr[j])
{
count[i]++;
}
}
}
for(int i=0;i<len;i++)
{
System.out.println(arr[i] + "occurs"+ count[i]+"times");
}

}
}