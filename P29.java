import java.io.*;
import java.util.*;
import java.lang.Math;
public class P29
{
public static void main(String args[])
{
System.out.println("enter the binary number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=num;
int num3=num;
int count1=0;
int count=0;
while(num2>0)
{
num2=num2/10;
count++;
}
int sum=0;
while(num3>0)
{
int digit=num3%10;
if(digit==1)
{
sum=sum +(int) Math.pow(2,count1);
}
count1++;
num3=num3/10;
}
System.out.println("binary to decimal is"+sum);
int decimal=sum;
//divi=divis*quo+remi------------------------------------
int remi=0;
int newnum=0;
while(decimal>0)
{

int decimal1=decimal;
int decimal3=decimal;
if(decimal3%8==0)
{
remi=0;
}
else if(decimal3%8==1)
{
remi=1;
}
else if(decimal3%8==2)
{
remi=2;
}
else if(decimal3%8==3)
{
remi=3;
}
else if(decimal3%8==4)
{
remi=4;
}
else if(decimal3%8==5)
{
remi=5;
}
else if(decimal3%8==6)
{
remi=6;
}
else if(decimal3%8==7)
{
remi=7;
}

decimal=decimal/8;
int quo=(decimal1-remi)/8;
decimal1=decimal1/8;
 newnum=newnum*10+remi;

}
//System.out.println("newnum is"+newnum);
int newnum1=newnum;
int reverse=0;
while(newnum1>0)
{
int reminder=newnum1%10;
 reverse=reverse*10+reminder;
newnum1=newnum1/10;
}
System.out.println("octal number of the binary number is "+reverse);
}
}