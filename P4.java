import java.io.*;
import java.util.*;

public class P4
{
public static void main(String args[])
{
  System.out.println("enter the number");
  System.out.println("to which we want sum up to that number");
  Scanner sc= new Scanner(System.in);
  int num= sc.nextInt();
  int sum=0;
  for(int i=0;i<=num;i++)
   {
     sum=sum+i;
   }
System.out.println("sum of first "+num+"number is"+sum);
}
}