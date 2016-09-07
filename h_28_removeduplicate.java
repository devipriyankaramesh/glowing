import java.io.*;
import java.util.*;
class removeduplicate
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  String ans="";
  for(int i=0;i<str.length();i++)
  {
   char ch=str.charAt(i);
   if(ch!=' ')
       ans+=ch;
   str=str.replace(ch,' ');
  }
  System.out.println(ans);
}}
  
