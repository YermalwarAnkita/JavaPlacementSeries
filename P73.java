import java.io.*;
import java.util.*;
public class P73
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
System.out.println("enter the element of array1");
for(int i=0;i<len1;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enter the element of array2");
for(int i=0;i<len2;i++)
{
arr2[i]=sc.nextInt();
}
int small=0;
int large=0;
int count=0;
if(len1<len2)
{
small=len1;
large=len2;
}
else if(len2<len1)
{
small=len2;
large=len1;
}
else
{
small=len1;
large=len1;
}
if(small==len1)
{
for(int i=0;i<small;i++)
{
for(int j=0;j<large;j++)
{
if(arr1[i]==arr2[j])
{
count++;
}
}
}
}

else{
for(int i=0;i<large;i++)
{
for(int j=0;j<small;j++)
{
if(arr1[i]==arr2[j])
{
count++;
}
}
}
}
if(small==len1)
{
if(count==small)
{
System.out.println("arr1 is subset of arr2");
}
}
if(small==len2)
{
if(count==small)
{
System.out.println("arr2 is subset of arr1");
}
}

}
}