import java.io.*;
import java.util.*;
public class P15
{
public static void main(String args[])
{
System.out.println("enter the number upto we want armstrong number ");
Scanner sc= new Scanner(System.in);
int nums=sc.nextInt();
int nume=sc.nextInt();
int sum,digit,k,j,j1,mul,count,i1;

for(int i=nums;i<=nume;i++)
{
 count=0;
 sum=0;
 j=i;
 j1=i;
i1=i;
while(j1>0)
{
j1=j1/10;
count++;
}
//System.out.println(j+"contain"+count+"digit");
while(j>0)
{
   mul=1;
   
digit=j%10;
for(k=0;k<count;k++)
{
mul=mul*digit;
}
sum=sum+mul;
j=j/10;
}
if(sum==i)
{
System.out.println("it is armstrong number" + sum);
}
}

}
}