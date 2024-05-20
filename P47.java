import java.io.*;
import java.util.*;
public class P47
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int num=a;
int num1=a;
int count=0;
while(num>0)
{
num=num/10;
count++;
}
switch(count)
{
case 1:
{
switch(a)
{
case 1:
System.out.println("one");
break;
case 2:
System.out.println("two");
break;
case 3:
System.out.println("three");
break;
case 4:
System.out.println("four");
break;
case 5:
System.out.println("five");
break;
case 6:
System.out.println("six");
break;
case 7:
System.out.println("seven");
break;
case 8:
System.out.println("eight");
break;
case 9:
System.out.println("nine");
break;
}
}
break;
 
case 2:
{
int d=num1%10;
}
}
}
}