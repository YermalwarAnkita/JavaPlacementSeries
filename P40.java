import java.io.*;
import java.util.*;
public class P40
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int num2=num;
int num3=num;
int num4=num;
char[] arr=new char[30];
int count=0;
while(num1>0)
{
int digit=num1%10;
num1=num1/10;
}
count++;
while(num2<27 && num2>0)
{
int d;
if(num2>=100)
{
 d=num2%100;
if(d>0 && d<27)
{
count++;
}
num2=num2/10;
}
else if(num2<=99)
{
d=num2%10;
num2=num2/10;
}
}
//count++;
int d1;
int j=0;
while(num4>0)
{
if(j==0)
{
d1=num4%10;
num4=num4/10;
j++;
}
else if(j>0 )
{
d1=num4%100;
if(d1<27 && d1>0)
{
count++;
}
num4=num4/10;
j++;
}
}
int k=0;
int d3;
while(num3>0)
{
if(k==0)
{
d3=num3%10;
num3=num3/10;
k++;
}
else if( num3>=100 )
{
d3=num3%100;
if(d3>0 && d3<27)
{
count++;
}
k++;
num3=num3/10;
}
}

//count--;
System.out.println("count is "+ count);
}
}