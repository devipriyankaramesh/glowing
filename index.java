import java.io.*;
import java.util.*;
class index
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int p=0;
  int n=s.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
       a[i]=s.nextInt();
  for(int i=0;i<n;i++)
  {
    if(a[i]==i)
       System.out.println(a[i]);
    else
    {
      p=p+1;
      continue;
    }
  }
  if(p==n)
  {
   System.out.println("no such elements");
  }
 }
}
