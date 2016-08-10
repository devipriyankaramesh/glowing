import java.util.*;
class workingday
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  String[] a={"monday","tuesday",wednesday",thursday","friday","saturday"};
  int p=0;
  String str=s.nextLine();
  if(str.equalsIgnoreCase("sunday")
        p=1;
  for(int i=0;i<a.length;i++)
  {
        if(str.equalsIgnoreCase(a[i])
              p=2;
  }
  if(p==1)  System.out.println("false");
  else if(p==2)
             System.out.prinltn("true");
  else if(p==0)   System.out.println("invalid");
  }
  }
