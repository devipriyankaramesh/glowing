import java.io.*;
import java.util.*;
class rotate
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    int m=0;
    for(int i=0;i<n;i++)  {    a[i]=s.nextInt();   }
    int k=s.nextInt();
    for(int j=k+1;j<a.length;j++)
       b[m++]=a[j];
    for(int j=0;j<=k;j++)
       b[m++]=a[j];
    for(int aa:b)
       System.out.print(aa);
  }
}
