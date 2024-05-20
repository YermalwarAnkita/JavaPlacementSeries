import java.io.*;
import java.util.*;
public class P19
{
public static void main(String args[])
{
System.out.println("enter the number to find factor of");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i,j,mul;
for(i=1;i<=num;i++)
{
for(j=num;j>0;j--)
{

mul=i*j;
if(mul==num)
{
System.out.println(i+"*"+j+"="+mul);
}
}
}
System.out.println("these are the factor of"+num);
}
}