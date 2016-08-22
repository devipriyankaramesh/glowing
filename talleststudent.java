import java.util.*;
class talleststudent
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int[] ar=new int[50];
  for(int i=0;i<50;i++)
      ar[i]=s.nextInt();
  Arrays.sort(ar);
  System.out.println("the fourth tallest student is"+ar[ar.length-4]);
  System.out.println("enter the n th student");
  int n=s.nextInt();
  System.out.println("the n th tallest student is"+ar[ar.length-n]);
}
}
