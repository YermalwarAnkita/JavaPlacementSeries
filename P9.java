import java.io.*;
import java.util.*;
public class P9
{
public static void main(String args[])
   {
     System.out.println("enter the number");
     System.out.println("to chek prime or not");
    Scanner sc= new Scanner(System.in);
     boolean is_prime=true;
   int num = sc.nextInt();
int num1=num;
   for(int i=2;i<=num/2;i++)
{
     if(num%i==0)
      {
      is_prime=false;
      break;
      }
}
       if(is_prime==true)
         {
       System.out.println(num1+"is prime number");
          }
       else
       {
       System.out.println(num1+"is not prime number");
       }    
   }
}