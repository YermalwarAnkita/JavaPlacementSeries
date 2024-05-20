import java.io.*;
import java.util.*;
public class P40n
{
public static void main(String args[])
{
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int num2=num;
int count=0;
while(num>0)
{
int d=num%10;
num=num/10;
}
if(num==0)
{
count++;
}

while(num1>0)
{
num1=num1/10;
if(num1>99)
{
int k=num1%100;
if(k>0 && k<27)
{
count++;
}
}
}

while(num2>0)
{
int d=num2%100;
if(d>0 && d<27)
{
count++;
}
num=num/10;
}





while(num2>0)
{
num2=num2/10;
int d=num2%100;
if(d>0 && d<27)
{
count++;
}
}


System.out.println("count is"+count);
}
}