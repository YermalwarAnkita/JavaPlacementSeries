import java.io.*;
import java.util.*;
public class P39
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int onum=num1;
boolean flag=true;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
flag=false;
break;
}

}

if(flag==true)
{
System.out.println(num1+"is prime number");

}
else
{
System.out.println(num1+"is not prime");
}
int count=0;
//if(flag==true)
//{

 for(int j=2;j<=num1/2;j++)
{
boolean flag1=true;
for(int k=2;k<=j/2;k++)
{
if(j%k==0)
{
flag1=false;
break;
}
}
boolean flag2=true;
if(flag1==true)
{
int num2=onum-j;

for(int k=2;k<=onum/2;k++)
{

if(num2%k==0)
{
flag2=false;
break;
}
}

if(flag2==true)
{
System.out.println(num1+" = "+j+" + "+num2);
count++;
}



}
if(count==0)
{
System.out.println("no ");
}


}
}
//}

}