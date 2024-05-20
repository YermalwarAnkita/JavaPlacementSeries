import java.io.*;
import java.util.*;
public class P48
{
public static void main(String args[])
{
System.out.println("enter the since of current year");
System.out.println("enter a month to chek number of digit in month");
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
String month=sc.next();
System.out.println("entered month is : "+month);
int days;
switch(month)
{
case "January":
days=31;
break;

case "February":
{
days=28;
if(year%4==0)
{
days++;
}

}
break;

case "March":
days=31;
break;

case "April":
days=30;
break;

case "May":
days=31;
break;

case "June":
days=30;
break;

case "July":
days=31;
break;

case "Augast":
days=31;
break;

case "September":
days=30;
break;

case "October":
days=31;
break;

case "January":
days=30;
break;

case "February":
days=31;
break;


}

System.out.println("number of days in month" + month +"of year is "+days);
}
}