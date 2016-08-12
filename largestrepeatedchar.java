import java.io.*;
import java.util.*;
class largestrepeatedchar
{
 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
   String s1=s.nextLine();
   String[] a=s1.split(" ");
   int[] c=new int[a.length];
   int m=0;
   for(int i=0;i<a.length;i++)
   {
      int count=0;
      for(int j=0;j<a[i].length();j++)
      {
         for(int k=j+1;k<a[i].length();k++)
         {
          if(a[i].charAt(j)!=' ')
          {  
            if(a[i].charAt(j)==a[i].charAt(k))
            {
                count=count+1;
            }
          }
        }
         a[i]=a[i].replace(a[i].charAt(j),' ');
      }
      c[m++]=count;
    }
    Arrays.sort(c);
    System.out.println(c.length);
  }
}
