import java.io.*;
import java.util.*;
public class P70
{
public static void main(String args[])
{
System.out.println("enter number rows and col in an two dimensional array");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][] arr=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.println("arr ["+i+"]["+j+"]"+"= "+arr[i][j]);
}
}

for(int i=0;i<r;i++)
{
for(int j=i+1;j<r;j++)
{
if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0])
{
System.out.println("symmetric pair ("+arr[i][1]+" "+arr[i][0]+")");
}
}
}
}
}