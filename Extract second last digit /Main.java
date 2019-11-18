import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int n1=n/10;
      int n2=n1%10;
      System.out.println(n2);
	}
}