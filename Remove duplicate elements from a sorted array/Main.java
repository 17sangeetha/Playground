#include <stdio.h>
int main() 
{
    int n;
    scanf("%d", &n);
    int array[n];
    for(int i = 0; i < n; i++)
    {
        scanf("%d",&array[i]);
    }
    int newSize = n;
    int prev = array[0];
    int currentIndex = 1;
    for (int i = 1; i < n; i++)
    {
        if(prev != array[i])
        {
            prev = array[i];
            array[currentIndex] = prev;
            currentIndex++;
        } 
        else 
        {
            newSize--;
        }
    }
    for (int i = 0; i < newSize; i++)
        printf("%d ", array[i]);
    printf("\n");
	return 0;
}