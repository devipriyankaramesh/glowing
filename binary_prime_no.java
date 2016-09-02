import java.util.*;
class binary_prime_no
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int count=cal_prime(a,b);
  System.out.println("Count is"+" "+count);
}
public static int cal_prime(int m,int n)
{
 int prime_no_count=0;
 for(int i=m;i<=n;i++)
 {
  int count=0,c=0;
    String ss=Integer.toString(i,2); System.out.println(ss+"------"+i);
  for(int j=0;j<ss.length();j++)
    if(ss.charAt(j)=='1')
       count++;
  System.out.println(count);
  for(int k=2;k<=count/2;k++)
  {
    if(count%k==0){  c=1;  }
  }
  if(c==0){
     prime_no_count++;}
  
}
return prime_no_count;
	}
}
