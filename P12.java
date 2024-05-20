import java.io.*;
import java.util.*;
public class P12
{
  public static void main(String args[])
{
  System.out.println("enter the number");
  System.out.println("to change into reverse number");
  Scanner sc= new Scanner(System.in);
  int num= sc.nextInt();
int num1=num;
int rev_num=0;
int digit;
  while(num>0)
{
  digit=num%10;
  rev_num= rev_num*10 + digit;
  num=num/10;
}
System.out.println(rev_num+"is reverse number of"+num1);
}
}