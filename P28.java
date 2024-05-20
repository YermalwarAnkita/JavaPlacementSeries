import java.io.*;
import java.util.*;
import java.lang.Math;
public class P28
{
public static void main(String args[])
{
System.out.println("enter the binary number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=num;
int i=0;
double sum=0;
int digit;
while(num2>0)
{
digit=num2%10;
if(digit==1)
{
sum=sum+Math.pow(2,i);
}
num2=num2/10;
i++;

}
System.out.println(sum);
}
}