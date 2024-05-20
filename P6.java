import java.io.*;
import java.util.*;
public class P6
{
public static void main(String args[])
{
System.out.println("enter two number");
System.out.println("to find greater number");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
if(x>y)
{
System.out.println(x + "is greater than" + y);
}
else
{
System.out.println(y + "is greater than" + x);
}
}
}