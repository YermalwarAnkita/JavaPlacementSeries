import java.io.*;
import java.util.*;
public class P36
{
public static void main(String args[])
{
System.out.println("enter total number of people");
Scanner sc= new Scanner(System.in);
int people=sc.nextInt();
int handshake=0;
if(people <0)
{
System.out.println("no such type of condition is valid");
handshake=0;
}
else
{
handshake=(people*(people-1))/2;
}
System.out.println("maximun number of handshake "+handshake);
}
}