import java.io.*;
import java.util.*;
public class P49
{
public static void main(String args[])
{
System.out.println("enter string");
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();
System.out.println("enter number to chek how much times it present in string");
char c1=sc.next().charAt(0);
char c[]=new char[20];
int count=0;
for(int i=0;i<s.length();i++)
{
c[i]=s.charAt(i);

}
for(int j=0;j<s.length();j++)
{
if(c[j]==c1)
{
count++;
}

}
System.out.println(c1 +"occurs "+count+" times ina string");
}
}