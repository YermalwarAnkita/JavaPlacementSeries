import java.io.*;
import java.util.*;
public class P17
{
static int factorials(int num1)
{
if(num1==0 || num1==1)
{
return 1;

}
else
{
return num1*factorials(num1-1);
}
}
public static void main(String args[])
{
int num;
System.out.println("enter the number to find factorial of");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int factorial;
factorial=factorials(num);
System.out.println(factorial);

}
}