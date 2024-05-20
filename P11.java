import java.io.*;
import java.util.*;
public class P11
{
  public static void main(String args[])
  {
   System.out.println("enter the number");
   System.out.println("to calculate sum of digit of number");
   Scanner sc= new Scanner(System.in);
   int num= sc.nextInt();
int num1=num;
int sum=0,digit;
   while(num>0)
    {
        digit=num%10;
        sum=sum+digit;
        num=num/10;
    }
System.out.println("addition of digit of "+num1+  " is "+ sum);
  }
}