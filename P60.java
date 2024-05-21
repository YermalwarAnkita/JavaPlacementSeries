import java.io.*;
import java.util.*;
public class P60
{
public static void main(String args[])
{
System.out.println("enter 1 for assending sorting & enter 2 for decending sorting");
Scanner sc =new Scanner(System.in);
int num=sc.nextInt();
switch(num)
{
case 1:
{
System.out.println("enter length of array");
int len=sc.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
int s;
for(int i=0;i<len;i++)
{
for(int j=i;j<len;j++)
{
if(arr[i]>arr[j])
{
s=arr[i];
arr[i]=arr[j];
arr[j]=s;
}
}
}
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}
}
break;


case 2:
{
System.out.println("enter length of array");
int len=sc.nextInt();
int[] arr=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}
int k;
for(int i=0;i<len;i++)
{
for(int j=i;j<len;j++)
{
if(arr[i]<arr[j])
{
k=arr[i];
arr[i]=arr[j];
arr[j]=k;
}
}
}
for(int i=0;i<len;i++)
{
System.out.print(" "+arr[i]);
}
}

break;
}





}
}