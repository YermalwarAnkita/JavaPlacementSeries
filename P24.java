import java.io.*;
import java.util.*;
public class P24
{
public static void main(String args[])
{
System.out.println("enter two numbers to chek the numbers are friendly pair or not");
Scanner sc=new Scanner(System.in);
int mul2,k,l,mul,i,j,sum1=0,sum=0;
int num=sc.nextInt();
int num2=sc.nextInt();
System.out.println("factor of "+num+"are");
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

System.out.println("factor of "+num2+"are");
for(k=1;k<=num2;k++)
{
for(l=num2;l>0;l--)
{
mul2=k*l;
if(mul2==num2)
{
if(k==num2)
{
continue;
}
else
{
sum1=sum1+k;
}
System.out.println(k+"*"+l+"="+mul2);
}
}
}

System.out.println("sum of factor of"+num+"is"+sum);
System.out.println("sum of factor of"+num2+"is"+sum1);
if(sum/num==sum1/num2)
{
System.out.println(num+"and"+num2+"are friendly pair");
System.out.println(sum/num+"is equal to "+sum1/num2);
}
else
{
System.out.println(num+"and"+num2+"are not friendly pair");
System.out.println(sum/num+"is not equal to "+sum1/num2);
}
}
} 