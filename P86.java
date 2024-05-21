import java.io.*;
import java.util.*;
public class P86
{
public static void main(String args[])
{
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=1;
int num1=1;
for(int i=0;i<n;i++)
{
for(int j=i;j<=n/2;j++)
{
System.out.print(" ");
}
num1=num*num;
System.out.print(num1);
num=num*10+1;
System.out.println("");
}
}
}