import java.util.*;
class h_27
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String ss=s.nextLine();
  for(int i=0;i<ss.length();i++)
  {
   for(int j=i+1,j<ss.length();j++)
   {
    System.out.println(ss.substring(i,j));
  }
  }}}
