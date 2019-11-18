import java.util.Scanner;
public class Main{
  public static int func1(int a,int b)
  {
    int gcd=1;
    for(int i=1;i<=a && i<=b;++i)
    {
      if(a%i==0 && b%i==0)
         gcd=i;
    }
    return gcd;
  }
   public static int func2(int a,int b)
  {
    int gcd=1;
    for(int i=1;i<=a && i<=b;++i)
    {
      if(a%i==0 && b%i==0)
         gcd=i;
    }
    return gcd;
  }   
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r1=func1(n1,n2);
      int r2=func2(r1,n3);
      System.out.println(r2);
	}
}