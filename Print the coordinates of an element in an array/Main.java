#include <stdio.h>
int main() 
{
    int  i, j, count = 0;
    int arr[10][10], search, r, c;
    scanf("%d  %d", &r, &c);
   	for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
         scanf("%d", &arr[i][j]);
   	}
  	scanf("%d", &search);
 	for (i = 0; i < r; i++)
    {       
        for (j = 0; j < c; j++)
        {
            if (arr[i][j] == search)
            { 
  				printf("(%d, %d)\n", i, j);
               	count++;
            }
        }    
    } 
       if (count == 0)
             printf("(-1, -1)");
   return 0;
}
