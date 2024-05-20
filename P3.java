import java.io.*;
import java.util.*;

public class P3
{ 
public static void main(String args[])
{ 
  System.out.println("enter the number");
  System.out.println("upto which we want to sum of that number");
  Scanner sc =new Scanner(System.in);
  int end= sc.nextInt();
  int sum=((end)*(end+1))/2;
  System.out.println("sum of first"+end+"number is"+sum);

}
}