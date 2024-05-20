import java.io.*;
import java.util.*;
public class P8
{
public static void main (String args[])
   {
      System.out.println("enter the number to chek leap year or not");
      Scanner sc = new Scanner(System.in);
      int year= sc.nextInt();
      if(year%4==0)
{
System.out.println(year+"is leap year");
}
else
{
System.out.println(year+"is not leap year");
}
   } 
}