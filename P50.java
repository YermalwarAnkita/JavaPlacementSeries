import java.io.*;
import java.util.*;
public class P50
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int divisor=sc.nextInt();
System.out.println("we chek now how much divisor it have");
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
System.out.println("number of divisor is: "+count);
}
}