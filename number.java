import java.io.*;
import java.util.*;
class number
{
 public static void main(String[] args)
 {
  	Scanner s=new Scanner(System.in);

int num=s.nextInt();
if(num>=0){
if(num==0 || num%2==0)
System.out.println("even");
else
System.out.println("odd");
}
else
System.out.println(0);
}}
