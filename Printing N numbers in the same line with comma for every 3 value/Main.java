import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int num=0;
    for(int i=1;i<=n;i++)
    {
      num=num+1;
      System.out.print(num);
      if((i%3==0)&&(i!=n))
      {
        System.out.print(",");
      }
    }
  }
}