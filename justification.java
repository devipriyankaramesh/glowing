import java.io.*;
import java.util.*;
class justi
{
 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);
   String ss=s.nextLine();
   int n=s.nextInt();
   String[] s1=ss.split(" ");
   String s2=new String();int i=0;
   System.out.print("[");
   while(i<s1.length)
   {                  
      if(s1[i].length()<=n)
      {              
        if((s2.length()+s1[i].length())<=n)
        {             
           s2=s2+s1[i]+" ";               
        }
        else
        {
           System.out.print("'");
           System.out.print(s2);
           System.out.println("',");
          s2="";
          s2=s1[i]+" "; 
        } 
      }i++;
    }  
    System.out.print("'");
           System.out.print(s2);
           System.out.println("'.");
    System.out.println("]");
        
}}
 
