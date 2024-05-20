import java.io.*;
import java.util.*;
public class P34
{
public static void main(String args[])
{
 System.out.println("enter the points");
 Scanner sc= new Scanner(System.in);
 int p1=sc.nextInt();
 int p2=sc.nextInt();
 if(p1>=0 && p2>=0)
{
System.out.println(p1 +"&"+ p2+"these points lies between FIRST quadrant");
}
else if(p1<0 && p2>=0)
{
System.out.println(p1 +"&"+ p2+"these points lies between SECOND quadrant");
}
else if(p1<0 && p2<0)
{
System.out.println(p1 +"&"+ p2+"these points lies between THIRD quadrant");
}
else if(p2<0 && p1>=0)
{
System.out.println(p1 +"&"+ p2+"these points lies between fourth quadrant");
}

}
}