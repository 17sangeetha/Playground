import java.util.Scanner;
class Main{
  public static int func1(int a,int b)
  {
    int result;
    if(a>b)
      result=a;
    else
      result=b;
    return result;
  }
  public static int func2(int r,int s)
  {
    int result1;
    if(r>s)
     result1=r;
    else
      result1=s;
    return result1;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r1=func1(n1,n2);
      int r2=func2(r1,n3);
      System.out.println(r2);
	}
}