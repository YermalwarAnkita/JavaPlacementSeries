import java.io.*;
import java.util.*;
public class P48n1
{
public static void main(String args[])
{
System.out.println("enter the current year1");
System.out.println("enter the number of year");
Scanner sc=new Scanner(System.in);
int year1=sc.nextInt();
int year=sc.nextInt();
if(year==1 || year==3 || year==5 ||year==7 || year==8 || year==10 ||year==12)
{
System.out.println("number of days is 31");
}
else if(year==4 || year==6 || year==9 ||year==11 )
{
System.out.println("number of days is 30");
}
else if(year==2)
{
if(year1%4==0)
{
System.out.println("number of days is 29");
}
else
{
System.out.println("number of days is 28");
}
}
}
}