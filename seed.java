import java.io.*;
import java.util.*;
class seed
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   int j=i,m=1;
   int sum=j;
   while(j!=0)
   {
     m*=j%10;
     j=j/10;
    }
    sum+=m;
    if(sum==n)
    {
      System.out.println(i);
      break;
    }
  }
  }
}
    
    
