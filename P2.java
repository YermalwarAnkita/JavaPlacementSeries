import java.io.*;
import java.util.*;
 
public class P2
{ 
public static void main(String args[])
{ 
 System.out.println("enter two number");
 System.out.println("to chek number is odd or even");
 Scanner sc = new Scanner(System.in);
 int num =sc.nextInt();
 if(num%2==0)
{ 
System.out.println( num +"it is even number");
}
else
{ 
System.out.println(num+"it is odd number");
}

}
}