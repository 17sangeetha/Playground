import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
  		// Type your code here
        int n=in.nextInt();
        int m=1;
        for(int row=1;row<=n;row++)
        {
          for(int col=1;col<=row;col++)
          {
            System.out.print(m);
          }
          System.out.print("\n");
          m=m+1;
        }
	}
}