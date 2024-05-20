import java.io.*;
import java.util.*;
public class P42
{
public static void main(String args[])
{
System.out.println("enter any key");
Scanner sc=new Scanner(System.in);
char b=sc.next().charAt(0);
if((b>=65 && b<=90) || (b>=97 && b<=122))
{
System.out.println("you entered is character");
}
else if(b>=48 && b<=57)
{
System.out.println("you entered is number");
}
else
{
System.out.println("except number and alphabet");
}


}
}