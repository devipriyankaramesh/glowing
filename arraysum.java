import java.i0.*;
import java.util.*;
class arraysum
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] a=new int[n];
  int p=0;
  for(int i=0;i<n;i++)
      a[i]=s.nextInt();
  for(int i=0;i<n;i++)
  {
   for(int j=i+1;j<n;j++)
   {
    for(int k=j+1;k<n;k++)
    {
     if(a[i]+a[j]==a[k])
      {
        System.out.println(a[i]+" "+a[j]+" "+a[k]);p=1;
        break;
      }
    }
  }
  if(p==0){  System.out.println("no elements");  }
  }}}
