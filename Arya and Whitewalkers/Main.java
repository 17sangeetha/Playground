#include <stdio.h>
int main() {
		int n,c=0;
		scanf("%d",&n);
		while(n!=0)
		{
		    if((n%2)==1)
		    {
		        c=c+1;
		    }
		    n=n/2;
		}
		printf("%d",c);
	return 0;
}