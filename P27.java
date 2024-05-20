import java.io.*;
import java.util.*;
public class P27
{
public static void main(String args[])
{
System.out.println("enter the two number to find greatest common divisor");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=sc.nextInt();
int small;
if(num<num2)
{
small=num;
}
else
{
small=num2;
}
while(true)
{
if(num%small==0 && num2%small==0)
{
System.out.println(small+"is GCD of"+num+"and"+num2);
break;
}
small--;
}

}
}