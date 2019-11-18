import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int r,sum=0;
      while(num>0)
      {
         r=num%10;
         sum=sum+(r*r*r);
         num =num/10;
      }
      if(temp==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}