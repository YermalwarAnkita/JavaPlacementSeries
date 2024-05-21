import java.io.*;
import java.util.*;
public class P90
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=11;

/*for(int i=0;i<n;i++)
{
int num1=num;
for(int j=i;j<=n;j++)
{
System.out.print(" ");
}

while(num>0)
{
int digit=num%10;
System.out.print(digit+" ");
num=num/10;
}
num=num1*11;
System.out.println("");
}
*/
int c=1;
for(int i=0;i<n;i++)
{
for(int s=1;s<n-i;s++)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
if(i==0 || j==0)
{
 c=1;
}
else
{
c=(c*(i-j+1))/j;
}
System.out.print(" "+c);
}
System.out.println("");
}
}
}