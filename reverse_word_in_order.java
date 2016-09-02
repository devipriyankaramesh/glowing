import java.util.*;
class reverse_word_in_order
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String ss=s.nextLine();
  String[] a=ss.split(" ");
  for(int i=a.length-1;i>=0;i--)
  {
    System.out.print(a[i]+" ");
  }
}}
