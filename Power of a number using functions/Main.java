import java.util.*;
class Main
{
  public static int power(int a,int b)
  { 
     int pow=1;
    while(b>0)
    {
      pow=pow*a;
      b--;
    }
   return pow;
  }
      
  public static void main (String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int e=in.nextInt();
    int m=power(base,e);
    System.out.println(m);
  }
}