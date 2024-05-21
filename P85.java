import java.io.*;
import java.util.*;
public class P85
{
public static void main(String args[])
{
System.out.println("enter number ");
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
}
}