import java.io.*;
import java.util.*;
public class P90n
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fact f=new fact();
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print(f.bino(i,j)+" ");
}
System.out.println("");
}
}
}

 class fact
{
public int bino(int a,int b)
{
int mul=1,mul2=1,mul3=1;
for(int i=1;i<=a;i++)
{
mul=mul*i;
}
int c=a-b;
for(int i=1;i<=c;i++)
{
 mul2=mul2*i;
}
for(int i=1;i<=b;i++)
{
mul3=mul3*i;
}
int k=mul2*mul3;
int result=mul/k;
return result;
}
}  