import java.io.*;
import java.util.*;
public class P22
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int sum=0,digit;
while(num1>0)
{
digit=num1%10;
sum=sum+digit;
num1=num1/10;
}
if(num%sum==0)
{
System.out.println(num+"divided by"+sum+"is equal to 0");
System.out.println(num+"is harshad number");
}
else
{
System.out.println(num+"divided by"+sum+"is not equal to 0");
System.out.println(num+"is not harshad number");
}
}
}