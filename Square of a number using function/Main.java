import java.util.Scanner;
class Main
{
    public static int sqr(int a)
    {
      int s=a*a;
      return s;
    }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>0)
      {
        int b=sqr(n);
        n=b;
        System.out.println(n);
      }
	} 
}