import java.io.*;
import java.util.*;
public class P46
{
public static void main(String args[])
{
System.out.println("enter the number to find length");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int num=a;
int count=0;
while(num>0)
{
num=num/10;
count++;
}
System.out.println(a+"contain "+count+" digits");
}
}