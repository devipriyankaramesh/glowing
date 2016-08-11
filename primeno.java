import java.io.*;
import java.util.*;
class prno
{
 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
   for(int i=m;i<=n;i++)\
   {
     int p=0;
    for(int j=2;j<=i/2;j++)
    {
     if(i%j!=0)
         continue;
     else
         p=1;
    }
    if(p==0)
       count=count+1;
  }
  System.out.println(count);
}
}   
