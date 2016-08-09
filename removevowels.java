import java.util.Arrays;
import java.util.Scanner;
public class removevowels {
	public static void main(String[] args)
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String s1=s.nextLine();
		int count=0;
        for(int i=0;i<s1.length();i++)
        {
        	int j=(int)s1.charAt(i);
        	if((j>=65 && j<=91)||(j>=97 && j<=121))
        	{ 
        		count++;
        	}
        }
        if(count==s1.length()){
		String ss=" ";
		StringBuffer sb=new StringBuffer(s1);
		String s2=new String(sb.reverse());
		String[] a=s2.split("[aeiouAEIOU]+");
		System.out.println(sb);
		for(String aa:a)
			ss=ss+aa;
		System.out.println(ss.trim());
       
	}
else
	System.out.println("enter valid string");
}
}
