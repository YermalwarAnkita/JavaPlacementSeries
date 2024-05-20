import java.io.*;
import java.util.*;
class Radius
{
void rad(int b)
{
double c=3.14*b*b;
System.out.println("radius  is" +c);
}
}
public class P43
{
public static void main(String args[])
{
System.out.println("enter the radius of circle");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
Radius f=new Radius();
f.rad(a);
}
}