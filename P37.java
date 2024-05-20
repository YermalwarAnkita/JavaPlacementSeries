import java.io.*;
import java.util.*;
public class P37
{
public static void main(String args[])
{
System.out.println("enter two fractional values for addition");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
float f1=a/b;
float f2=c/d;
float m1=b*d;
System.out.println("denominator is "+m1);

int na=a*d;

int nc=c*b;
float r= (na+nc)/m1;
System.out.println("addition of two fraction is"+r);

}
}