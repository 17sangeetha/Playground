import java.util.*;
class Main { 
  
    // Function to find the index of an elemenDriver Code
    public static int find(int[] a,int s,int target)
{
	for (int i = 0; i < s; i++)
		if (a[i] == target)
			return i;

	return -1;
}
    public static void main(String[] args) 
    {   
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int n[]=new int[s];
        for(int i=0;i<s;i++)
        {
          n[i]=in.nextInt();
        }
      int k1=in.nextInt();
      int k2=in.nextInt();
      int a=find(n,s,k1);
      int b=find(n,s,k2);
      System.out.println(a);
      System.out.println(b);
      
} 
}