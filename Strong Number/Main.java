import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int temp=num;
      int first=num/100;
      int sec=(num/10)%10;
      int third=num%10;
      int fact1=1,fact2=1,fact3=1;
      for(int i=1;i<=first;i++)
      {
        fact1=fact1*i;
      }
      for(int i=1;i<=sec;i++)
      {
        fact2=fact2*i;
      }
      for(int i=1;i<=third;i++)
      {
        fact3=fact3*i;
      }
      int sum=fact1+fact2+fact3;
      if(temp==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}