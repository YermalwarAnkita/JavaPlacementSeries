import java.io.*;
import java.util.*;
public class P88
{
public static void main(String args[])
{
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i;j<=n/2;j++)
{
System.out.print(" ");
}
for(int k=0;k<2*i+1;k++)
{
System.out.print(i+1);
}
System.out.println("");
}
int m=0;
for(int i=n-1;i>0;i--)
{

for(int j=0;j<=m;j++)
{
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++)
{
System.out.print(i);
}
m++;
System.out.println("");
}
}
}