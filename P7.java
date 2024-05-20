import java.io.*;
import java.util.*;
public class P7
{
public static void main(String args[])
{
   System.out.println("eneter 1 for integer,enter 2 for floating number");
   Scanner sc= new Scanner(System.in);
   int chek=sc.nextInt();
   switch(chek)
   {
      case 1:
     {
       System.out.println("enter three number");
       System.out.println("to chek greatest number in given 3 number");
       int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
      if(x>y && x>z)
        {
      System.out.println(x+"is greatest number");
         }
     else if(y>x && y>z)
        {
       System.out.println(y+"is greatest number");
        }
      else if(x=y && x>z)
        {
      System.out.println(x+"is greatest number");
         }
     else if(x=z && x>y)
        {
       System.out.println(x+"is greatest number");
        }
     else if(y=z && z>x)
        {
      System.out.println(z+"is greatest number");
         }
     else if(y=x && z>y)
        {
       System.out.println(z+"is greatest number");
        }
     else if(y=z && x>z)
        {
      System.out.println(x+"is greatest number");
         }
     else if(y=x=z)
        {
       System.out.println("no one is greatest number");
        }
     else
       {
       System.out.println("this type of condition is not present");
       }

    } 



case 1:
     {
       System.out.println("enter three number");
       System.out.println("to chek greatest number in given 3 number");
       int x1=sc.nextFloat();
       int y1=sc.nextFloat();
       int z1=sc.nextFloat();
      if(x1>y1 && x1>z1)
        {
      System.out.println(x1+"is greatest number");
         }
     else if(y1>x1 && y1>z1)
        {
       System.out.println(y1+"is greatest number");
        }
      else if(x1=y1 && x1>z1)
        {
      System.out.println(x1+"is greatest number");
         }
     else if(x1=z1 && x1>y1)
        {
       System.out.println(x1+"is greatest number");
        }
     else if(y1=z1 && z1>x1)
        {
      System.out.println(z1+"is greatest number");
         }
     else if(y1=x1 && z1>y1)
        {
       System.out.println(z1+"is greatest number");
        }
     else if(y1=z1 && x1>z1)
        {
      System.out.println(x1+"is greatest number");
         }
     else if(y1=x1=z1)
        {
       System.out.println("no one is greatest number");
        }
     else
       {
       System.out.println("this type of condition is not present");
       }

    } 


  }




}
}