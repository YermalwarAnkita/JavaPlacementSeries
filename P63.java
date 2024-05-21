import java.io.*;
import java.util.*;
public class P63
{
public static void main(String args[])
{
System.out.println("enter the length of array");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr=new int[len];
int count=0;
for(int i=0;i<len;i++)
{
arr[i]=sc.nextInt();
}

Arrays.sort(arr);

for(int i=0;i<len;i++)
{
if(i==len-1)
{
if(arr[i]!=arr[0])
{
count++;
}
}
else
{
if(arr[i]!=arr[i+1])
{
count++;
}
}
}
System.out.println("number of different element in array is :"+ count);

}
}