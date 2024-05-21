import java.io.*;
import java.util.*;
public class P92
{
public static void main(String args[])
{
System.out.println("enter the value of n");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=(n*(n+1)*(2*n+1))/6;
System.out.println("sum of square is: "+ sum);
}
}