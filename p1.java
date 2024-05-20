import java.util.*;
public class P1
{
public static void main(String args[])
{
System.out.println("hello");
System.out.println("enter the number");
System.out.println("enter 1 for integer,enter 2 for float,enter 3 for character");
Scanner sc= new Scanner(System.in);
int number= sc.nextInt();
System.out.println(number + "it is entered");
switch(number)
{
case 1:
{
System.out.println("enter integer number");
Scanner sc1 =new Scanner(System.in);
int num = sc1.nextInt();
    if(num>0)
    {
        System.out.println("positive integer");
    }
    else
    {
         System.out.println("negative integer");
    }
  }
break;

case 2:

{
System.out.println("enter floating number");
Scanner sc2 =new Scanner(System.in);
float num1 = sc2.nextFloat();
    if(num1>0.00)
    {
        System.out.println("positive floating number");
    }
    else
    {
         System.out.println("negative floating number");
    }
  }
break;


/*case 3:
{

System.out.println("enter character");
Scanner sc3 =new Scanner(System.in);
char ch = sc3.next();
    if(ch>0)
    {
        System.out.println("positive  number");
    }
    else
    {
         System.out.println("negative  number");
    }
  }
break;*/


}
}
}