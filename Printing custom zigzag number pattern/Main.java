import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
      int a=0;
      for(int i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
          ++a;
          for(int j=1;j<n;j++)
            System.out.print(a);
          System.out.print(++a);
        }
        else
        {
          System.out.print(++a);
          --a;
          for(int j=1;j<n;j++)
            System.out.print(a);
        }
        System.out.println();
      }    
	}
}