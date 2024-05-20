import java.io.*;
import java.util.*;
public class P41
{
public static void main(String args[])
{
System.out.println("enter the character");
Scanner sc = new Scanner(System.in);
char ch= sc.next().charAt(0);
System.out.println(ch);
int a=ch;
//System.out.println(a);
if(a==65 || a==69 || a==73 || a==79 ||  a==85||  a==97 || a==101 || a==105 || a==111 || a==117)
{
System.out.println("entered character is vowel");
}
else
{
System.out.println("entered character is consonant");
}
}
}