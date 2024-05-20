import java.io.*;
import java.util.*;
public class P25
{
public static void main(String args[])
{
System.out.println("enter the two number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=sc.nextInt();
int i,small;
if(num<num2)
{
small=num;
}
else
{
small=num2;
}
for(i=small;i>0;i--)
{
if(num%i==0 && num2%i==0)
{
System.out.println("HCF of "+num+"and"+num2+"is"+i );
break;
}
}
}
}
