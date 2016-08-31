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
   int j=i,m=i;
   while(j!=0)
   {
     m*=j%10;
     j=j/10;
    }
    if(m==n)
    {
      System.out.println(i);
      break;
    }
  }
  }
}
    
    
