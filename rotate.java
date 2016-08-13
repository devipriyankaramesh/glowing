import java.io.*;
import java.util.*;
class rotate
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no of elements");
    int n=s.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    int m=0;
    System.out.println("Enter the elements is array");
    for(int i=0;i<n;i++)  {    a[i]=s.nextInt();   }
    System.out.println("Enter the key value");
    int k=s.nextInt();
    for(int j=k+1;j<a.length;j++)
       b[m++]=a[j];
    for(int j=0;j<=k;j++)
       b[m++]=a[j];
    System.out.println("the new array");
    for(int aa:b)
       System.out.print(aa);
  }
}
