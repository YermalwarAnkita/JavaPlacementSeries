import java.io.*;
import java.util.*;
public class P31
{
public static void main(String args[])
{
System.out.println("enter the number to convert decimal to octal");
Scanner sc= new Scanner(System.in);
int num;
num=sc.nextInt();
int[] bnum;
bnum=new int[50];
int i=0;
while(num>0)
{
bnum[i]=num%8;
num=num/8;
i++;
}
for(int j=i-1;j>=0;j--)
{
System.out.print(bnum[j]);
}


}

}