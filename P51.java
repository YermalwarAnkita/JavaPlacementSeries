import java.io.*;
import java.util.*;
public class P51
{
public static void main(String args[])
{
System.out.println("enter values of a,b,c in quadratic question");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double d=(b*b)-(4.0*a*c);
if(d>0.0)
{
double r1=(-b+Math.pow(d,0.5))/(2.0*a);
double r2=(-b-Math.pow(d,0.5))/(2.0*a);
System.out.println("roots are"+r1+"  "+r2);
}
else if(d==0)
{
double r1=-b/(2.0*a);
System.out.println("root is "+r1);
}
else
{
System.out.println("roots are not real");
}
}
}