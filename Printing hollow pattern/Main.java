import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    for(int row=1;row<=n;row++)
	    {
	        for(int col=1;col<=n;col++)
	        {   
	            if(row==1)
	            {
	              System.out.print("*"); 
	            }
	            else if(row==n)
	            {
	               System.out.print("*"); 
	            }
	            else
	            {
	                if(col==1 || col==n)
	                {
	                    System.out.print("*"); 
	                }
	                else
	                {
	                  System.out.print(" ");   
	                }
	           
	            }
	        }
	        System.out.print("\n");   
	    }
	}
}
