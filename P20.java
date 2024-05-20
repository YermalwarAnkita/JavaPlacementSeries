import java.io.*;
import java.util.*;
public class P20
{
public static void main(String args[])
{
System.out.println("enter the number to chek the number is perfect or not");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i,j,mul,sum=0,sum1;
for(i=1;i<=num;i++)
{
for(j=num;j>0;j--)
{
mul=i*j;
if(num==mul)
{
System.out.println(i+"*"+j+"="+mul);
if(i==num)
{
continue;
}
else
{
sum=sum+i;
}
}
}
}
sum1=sum/2;
System.out.println("these are the factor of "+num);
System.out.println("sum of factor is"+sum);
if(sum==num)
{
System.out.println(sum+"is equal to "+num+"it is perfect number");
}
else
{
System.out.println(sum+"is not equal to "+num+"it is not perfect number");
}
}
}