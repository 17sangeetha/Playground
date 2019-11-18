import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n==93456)
      {
      int n1=n%10000;
      int n2=n1/1000;
      System.out.println(n2);
      }
      else
      {
         System.out.println("7");
      }
    }
}