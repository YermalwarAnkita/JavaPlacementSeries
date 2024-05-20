import java.io.*;
import java.util.*;
public class P38
{
public static void main(String args[])
{
System.out.println("enter the length number");
Scanner sc =new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int[] bnum;
bnum=new int[20];
int i=0;
while(num1>0)
{
int d=num1%10;
if(d==0)
{
d=1;
}
bnum[i]=d;
num1=num1/10;
i++;
}
System.out.println(num+"this is origional number");
System.out.println("all 0 are replace by 1");
for(int j=i-1;j>=0;j--)
{
System.out.print(bnum[j]);
}


}
}