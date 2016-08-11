import java.io.*;
import java.util.*;
class isomorphic
{
 public static void main(String[] args)
 {
   Scanner ss=new Scanner(System.in);
   String input1=ss.nextLine();
   String input2=ss.nextLine();
   System.out.println(isIsomorphic(input1,input2));
 }
  public static boolean isIsomorphic(String s,String t)
  {
      int f=0,g=0;
      if(s.length()==t.length()){
      for(int i=0;i<s.length();i++)
      {
       for(int j=i+1;j<s.length();j++)
       {
         if(s.charAt(i)==s.charAt(j))
         {
          if(t.charAt(i)==t.charAt(j))
          { }
          else
             f=1;
          }
        }
       }
       }
       if(f==0 && g==0)  return true;
       else      return false;            
}
}
