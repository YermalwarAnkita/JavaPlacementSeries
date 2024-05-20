import java.io.*;
import java.util.*;
public class P21
{
public static void main(String args[])
{
System.out.println("enter the number to chek the number is automorphic or not");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int result;
int num1=num;
int num2=num;
int square=num*num;
System.out.println("square of"+num+"is"+square);
int count=0;
while(num2>0)
{
count++;
num2=num2/10;
}
System.out.println(num+"contain"+count+"digit");


int module=1;
for(int i=0;i<count;i++)
{
module=module*10;
}
System.out.println("to chek automorphic or not");
result=square%module;
if(result==num)
{
System.out.println(result+" is equal to"+ num+"it is automorphic");
}
else
{
System.out.println(result+" is not equal to"+ num+"it is not automorphic");
}

}
}