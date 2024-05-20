import java.io.*;
import java.util.*;

public class P5
{
public static void main(String args[])
{
System.out.println("enter start and end number");
System.out.println("to find sum of that number");
Scanner sc=new Scanner(System.in);
int start=sc.nextInt();
int end=sc.nextInt();
int sum=0,i;
for(i=start;i<=end;i++)
{
sum=sum+i;
}
System.out.println("sum of number from" + start + "to" +end + "is" +sum);
}
}
