import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      while(n>=10)
      {
        n=n/10;
      }
      int last=temp%10;
      int sum=n+last;
      System.out.println(sum);
	}
}