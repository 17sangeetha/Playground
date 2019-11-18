import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code fo
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int sum1=0;
    int sum2=0;
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    if(n%2==0)
    {
      for(int i=0;i<n/2;i++)
        sum1=sum1+a[i];
      for(int i=n/2;i<n;i++)
        sum2=sum2+a[i];
      if(sum1==sum2)
        System.out.println("perfect match");
      else
        System.out.println("Not a Perfect Batch");
    }
    else
    { 
      int n1=n-1;
      for(int i=0;i<n1/2;i++)
        sum1=sum1+a[i];
      for(int i=n/2+1;i<=n1;i++)
        sum2=sum2+a[i];
      if(sum1==sum2)
        System.out.println("Perfect Batch");
      else
        System.out.println("Not a Perfect Batch");
    }   
  }
}      
