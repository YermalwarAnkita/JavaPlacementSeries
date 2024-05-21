import java.io.*;
import java.util.*;

public class PrintMatrix
{
public static void  printInCircular(int arr[][],int r,int c)
{
int left=0;
int right=c-1;
int top=0;
int bottom=r-1;
int totalElement=0;
while(totalElement < r*c )
{
for(int i=left;i<=right;i++)
{
System.out.print(arr[left][i]);
totalElement++;
}
top++;
for(int i=top;i<=bottom;i++)
{
System.out.print(arr[i][right]);
totalElement++;
}
right--;
for(int i=right;i>=left;i--)
{
System.out.print(arr[bottom][i]);
totalElement++;
}
bottom--;
for(int i=bottom;i>=top;i--)
{
System.out.print(arr[i][left]);
totalElement++;
}
left++;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array i.e rows and col");
int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}
printInCircular(arr,r,c);
}
}