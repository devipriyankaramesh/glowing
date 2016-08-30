import java.util.*;
class tower
{
 public static void main(String[] args)
 {
  int n=5;
  towerofhanoi(n,'A','B','C');
 }
 public static void towerofhanoi(int no,char f,char in,char to)
 {
  if(no==1)
  {
    System.out.println("Disk 1 from "+ f +" " +"to " + to);
  }
  else
  {
   towerofhanoi(no-1,f,to,in);
   System.out.println("Disk " + no +" "+ "from"+ " "+ f +" " + "to " + to);
   towerofhanoi(no-1,in,f,to);
  }
 }
}
