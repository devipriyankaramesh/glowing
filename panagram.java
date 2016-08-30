import java.util.*;
class panagram
{
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
        System.out.print("Enter any word : ");
        String ss = s.nextLine();
        ss=ss.toLowerCase();
        int l = ss.length();
        char ch;
        String ans="";
        for(int i=0; i<l; i++)
        {
            ch = ss.charAt(i);
            if(ch!=' ')
                ans = ans + ch;
            ss = ss.replace(ch,' ');         
        }
       if(ans.length()==26)
       {
         System.out.println("panagram");}        
    }
}
   
