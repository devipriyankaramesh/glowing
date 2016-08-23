import java.io.*;
class subset
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] a=new int[n];
  int n1=s.nextInt();
  int[] b=new int[n1];
  for(int i=0;i<n;i++)
      a[i]=s.nextInt();
  for(int i=0;i<n1;i++)
      b[i]=s.nextInt();
  for(int j=0;j<n;j++)
  {
    if(b[0]==a[j])
    {
       m=j; break;
    }
  }
  for(int j=0;j<n1;j++)
  {
    if(m<n)
    {
      if(a[m]!=b[j])
      {    count++;  }
      m++;
    }
    else
      count++;
  }
  if(count==0)
     System.out.println("yes");
  else
     System.out.println("no");
 }
}
