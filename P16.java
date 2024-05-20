import java.io.*;
import java.util.*;
public class P16
{
static int fibonacci(int i)
{

if(i==0)
{
return 0;
}
if(i==1 || i==2)
{
return 1;
}
else
{
return fibonacci(i-1)+fibonacci(i-2);
}

}
public static void main(String args[])
{
System.out.println("enter the number upto we want fibonacci of");
Scanner sc =new Scanner(System.in);
int num1=sc.nextInt();
for(int j=0;j<num1;j++)
{
System.out.println(fibonacci(j)+ " ");
}
}


}