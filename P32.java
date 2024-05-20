import java.io.*;
import java.util.*;
public class P32
{
public static void main(String args[])
{
System.out.println("enter number to convert octal to binary");
Scanner sc=new Scanner(System.in);
int num;
num=sc.nextInt();
int sum=0;
int i=0;
while(num>0)
{
int digit=num%10;
sum=sum+(int)(Math.pow(8,i)*digit);
num=num/10;
i++;
}
System.out.println("decimal number is"+sum);
int decimal=sum;
int[] bnum;
bnum= new int[40];
int j=0;
while(decimal>0)
{
int digit1=decimal%2;
bnum[j]=digit1;
decimal=decimal/2;
j++;

}
for(int k=j-1;k>=0;k--)
{
System.out.print(bnum[k]);
}
}
}