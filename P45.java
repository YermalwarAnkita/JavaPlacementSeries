import java.io.*;
import java.util.*;
public class P45
{
public static void main(String args[])
{
System.out.println("prime number between 0 to 100 is");
for(int i=1;i<=100;i++)
{
boolean flag=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=false;
break;
}
}
if(flag==true)
{
System.out.println(i+"is prime");
}
}
}
}