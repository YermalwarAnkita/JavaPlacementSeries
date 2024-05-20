import java.io.*;
import java.util.*;
public class P23
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i,j,sum=0,mul;
for(i=1;i<=num;i++)
{
for(j=num;j>0;j--)
{
mul=i*j;

if(mul==num)
{
if(i==num)
   {
continue;
   }
else
   {
sum=sum+i;
   }
System.out.println(i+"*"+j+"="+mul);
}
}
}
if(sum>num)
{
System.out.println(sum+" sum of factor is greater than "+num+"number");
System.out.println("it is abundant number");
}
else
{
System.out.println(sum+" sum of factor is not greater than "+num+"number");
System.out.println("it is not abundant number");
}
   }
  }