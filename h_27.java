import java.util.*;
class h_27
{
 public static void main(String[] args)
 {
 	Scanner s=new Scanner(System.in);
  String ss=s.nextLine();
  int max=0;
  for(int i=0;i<ss.length();i++)
  {
   for(int j=i+1;j<=ss.length();j++)
   {  System.out.println(ss.substring(i,j)+"........"+ss.substring(i,j).length());}}
   if("abaca".equals("acaba")){ System.out.println("yes");}
   else { System.out.println("no"); }
  for(int i=0;i<ss.length();i++)
  {
   for(int j=i+1;j<ss.length();j++)
   {
    String s1=ss.substring(i,j);
    int maxxx=s1.length();
    StringBuffer sb=new StringBuffer(s1);
    String s2=new String(sb.reverse());
    if(s1.equals(s2)){  continue;  }
    else{
         if(max<maxxx){   max=maxxx;  }  }
   }
  }
  System.out.println(max);
	
	
  }}
