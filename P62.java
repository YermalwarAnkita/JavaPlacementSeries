import java.io.*;
import java.util.*;
public class P62
{
public static void main(String args[])
{
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
//pali p=new pali(); 
pali p=new pali();
int b[]=new int[len];
for(int i=0;i<len;i++)
{
b[i]=sc.nextInt();
}
Arrays.sort(b);
int max=b[0];
for(int i=0;i<len;i++)
{
p.pal(b[i],len);
}
}
}

class pali
{
  void pal(int num,int length)
{
int num1=num;
int length1=length;
int num2=num;
int count=0;
int rev_num=0;
while(num2>0)
{
num2=num2/10;
count++;
}
//System.out.println("length of number is :"+count);
//int arr[]=new int[length1];
while(num1>0)
{
int digit=num1%10;
rev_num=rev_num*10+digit;
num1=num1/10;
}

//System.out.println("reverse number is:"+rev_num);
int max=0;
if(rev_num==num)
{

System.out.println(num+"number is palindrome reverse and number is equal");
 max=num;
}

System.out.println("maximun palindrome number ina array is :" + max);

}
}