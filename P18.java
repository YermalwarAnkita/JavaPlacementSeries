import java.io.*;
import java.util.*;
public class P18
{
public static void main(String args[])
{
System.out.println("enter the number to find power of");
Scanner sc= new Scanner(System.in);
int power=sc.nextInt();
int num=sc.nextInt();
int result=1;
for(int i=1;i<=power;i++)
{
result=result*num;
}
System.out.println("power of"+num+"to power "+power+"is"+result);
}
}