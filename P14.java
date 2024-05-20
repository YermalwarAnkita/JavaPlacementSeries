import java.io.*;
import java.util.*;

public class P14
{
public static void main(String args[])
{
  int num,i,j,mul,digit,sum=0,count=0;
  System.out.println("enter the number");
  Scanner sc=new Scanner(System.in);
  num= sc.nextInt();
int num1=num;
int num2=num;
  while(num>0)
  {
   num=num/10;
   count++;
   }
System.out.println( "digit in number is" + count);
while(num1>0)
{
int cube=1;
digit=num1%10;
for(i=0;i<count;i++)
{
cube=cube*digit;
}
sum=sum+cube;
num1=num1/10;
  
}
if(sum==num2)
{
System.out.println( "it is armstrong number  "+num2+"is equal to" + sum);
}
else
{
System.out.println( "not armstrong number of "+num2+"is not equal to" + sum);
}
}
}