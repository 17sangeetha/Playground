import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner in= new Scanner(System.in);
     int n=in.nextInt();
     int n1=n/100;
     int n2=n%100;
    int n3=n2/10;
    int n4=n2%10;
    int rev=(n4*100)+(n3*10)+n1;
    System.out.println(rev);
  }
}