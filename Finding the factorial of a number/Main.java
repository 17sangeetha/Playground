import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int f=fact(num);
    System.out.println(f);
  }
  public static int fact(int n)
  {
    if(n>=1)
    {
      return n*fact(n-1);
    }
    else
      return 1;
  }
}
    