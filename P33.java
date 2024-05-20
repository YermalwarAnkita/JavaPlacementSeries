import java.io.*;
import java.util.*;
public class P33
{
public static void main(String args[])
{
System.out.println("enter octal number to convert into decimal ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0;
int sum=0;
while(num>0)
{
int digit=num%10;
sum=sum+(int)( Math.pow(8,i) * digit);
num=num/10;
i++;
}
System.out.println("octal to decimal is"+sum);
}
}