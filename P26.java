import java.io.*;
import java.util.*;
public class P26
{
public static void main(String args[])
{
System.out.println("enter the two number to find LCM ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=sc.nextInt();
int high;
if(num>num2)
{
high=num;
}
else
{
high=num2;
}
while(true)
{
if(high%num==0 && high%num2==0)
{
System.out.println("LCM of"+num+"and"+num2+"is"+high);
break;
}
high++;
}


}
}