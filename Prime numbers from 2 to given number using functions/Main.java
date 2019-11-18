import java.util.Scanner;
class Main
{
  public static boolean isPrime(int n)
  {
    if(n<=1)
      return false;
    for(int i=2;i<n;i++)
      if(n%i==0)
        return false;
    return true;
  }
  public static void prime(int n)
  {
    for(int i=2;i<=n;i++)
    {
      if(isPrime(i))
        System.out.println(i);
    }
  }
	public static void main (String[] args){
	    // Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(); 
    prime(n);
	}
}