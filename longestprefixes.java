import java.util.*;
class longestprefixes
{
 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
   String ss=s.nextLine();
  String s3="",s4="";
  int max=0;
   String[] s1=ss.split(" ");
   for(int i=0;i<s1.length;i++)
   {
      String s2=s1[i];
      for(int j=0;j<s2.length();j++)
      {
        for(int k=j+1;k<s2.length();k++)
        {
          if(s2.charAt(j)==s2.charAt(k))
          {
            s3=s2.substring(j,k);
           if(max<s3.length())
          {       max=s3.length();     s4=s3;   }
          }
        }
      }
    }
  System.out.println(max+" "+s4);
}}
