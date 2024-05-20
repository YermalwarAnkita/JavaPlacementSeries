import java.io.*;
import java.util.*;
public class P35
{
static int factorial(int val)
{
if(val==0 )
{
return 1;
//break;
}
else
{
return val*factorial(val-1);
}
}
public static void main(String args[])
{
 System.out.println("enter the number of people and seats available");
 Scanner sc=new Scanner(System.in);
 int people=sc.nextInt();
 int seat=sc.nextInt();
 int seat1;
 seat1=people-seat;
 int nseat1=1;
nseat1=factorial(seat1);
 int npeople=1;
npeople=factorial(people);
 System.out.println("factorial of people is "+npeople);
 System.out.println("factorial of seats available is "+nseat1);
 double ans=npeople/nseat1;
 System.out.println("permutation is "+ans);
}
} 