import java.util.*;
class binary_prime_no
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int count=cal_prime(a,b);
  System.out.println(count);
}
public static cal_prime(int m,int n)
{
 for(int i=m;i<=n;i++)
 {
  int j=0,count=0,prim_no_count=0,c=0;
  String ss=Integer.toString(m,2);
  for(int j=0;j<ss.length();j++)
    if(ss.charAt(j)=='1')
       count++;
  for(int k=2;k<=count/2;k++)
  {
    if(count%k==0){  c=1;  }
  }
  if(c==0)
     prime_no_count++;
}
return prime_no_count;
}
}
