import java.io.*;
import java.util.*;
public class P30
{
public static void main(String args[])
{
System.out.println("enter the decimal number to convert into binary");
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int num1=num;
int newnum=0;
int i=0;
int[] bnum;
bnum= new int[50];
while(num1>0)
{
/*int i=0;
int remi=num1%2;
newnum=newnum*10+remi;
num1=num1/2;*/
bnum[i]=num1%2;
num1=num1/2;
i++;
}
for(int j=i-1;j>=0;j--)
{
System.out.print(bnum[j]);
}
/*
System.out.println("number"+newnum);
int newnum1=newnum;
int result=0;
while(newnum1>0)
{
int reminder=newnum1%10;
result=result*10+reminder;
newnum1=newnum1/10;
}
System.out.println("number 1"+result);
*/
}
}