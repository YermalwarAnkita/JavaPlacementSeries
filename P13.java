import java.io.*;
import java.util.*;
public class P13
{
 public static void main(String args[])
{
  System.out.println("enter the number");
  System.out.println("to chek number is palindrome or not");
  Scanner sc= new Scanner(System.in);
  int num=sc.nextInt();
  int num1=num;
int digit,rev_num=0;
  while(num>0)
{
digit=num%10;
rev_num=rev_num*10+digit;
num=num/10;
}
if(rev_num==num1)
{
System.out.println(rev_num + "is equal to "+num1+" this is palindrome number");
}
else
{
System.out.println(rev_num+"is not equal to"+num1+" it is not palindrome number");
}
}
}