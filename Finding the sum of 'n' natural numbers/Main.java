import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int f=nat(num);
    System.out.println(f);
  }
  public static int nat(int n)
  {
    if(n>0)
    {
      return n+nat(n-1);
    }
    else
      return n;
  }
}
    