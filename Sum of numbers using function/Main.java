import java.util.Scanner;
class Main
{
   public static int sum(int a)
   {
     int num=0;
     for(int i=1;i<=a;i++)
     {
       num=num+i;
     }
     return num;
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=sum(n);
      n=b;
      System.out.println(n);
      
	}
}