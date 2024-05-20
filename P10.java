import java.io.*;
import java.util.*;
public class P10
{
  public static void main(String args[])
{
   System.out.println("enter the start and last number");
   System.out.println("to chek number is prime or not");
   Scanner sc=new Scanner(System.in);
   int start=sc.nextInt();
   int last= sc.nextInt();
   int start1=start;
   int last1=last;
   boolean is_prime=true;
  for(int i=start;i<=last;i++)
{
for(int j=2;j<=i/2;j++)
   {
     if(i%j==0)
      {
         is_prime=false;
          break;
      }
     else
       {
      is_prime=true;
        }
   }
       if(is_prime==true)
       {
          System.out.println(i+"is prime number");
        }
      else
      {
          System.out.println(i+"is not prime number");
       }
}

}
}