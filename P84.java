import java.io.*;
import java.util.*;
public class P84
{
public static void main(String args[])
{
for(int i=0;i<5;i++)
{
for(int j=i;j<=5;j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}
System.out.println("");
}
}
}