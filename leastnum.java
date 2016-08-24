import java.util.*;
class leastnum
{
 public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
int num=s.nextInt();
String ss=Integer.toString(num);
String s1="";
char[] ar=ss.toCharArray();
Arrays.sort(ar);
for(int i=0;i<ar.length-3;i++)
   s1=s1+ar[i];
int ans=Integer.parseInt(s1);
System.out.println(ans);
}} 
