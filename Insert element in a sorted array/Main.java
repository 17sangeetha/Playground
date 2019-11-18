#include <stdio.h>
int main() 
{
    int n;
    scanf("%d", &n);
    int arr[n], key, pos, m;
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    scanf("%d", &key);
    for(int i = 0; i < n; i++)
    {
        if(key < arr[i])
        {
            pos = i;
            break;
        }
        if(key > arr[n - 1])
        {
            pos = n;
            break;
        }
    }
    if (pos != n)
    {
        m = n - pos + 1 ;
        for (int i = 0; i <= m; i++)
            arr[n - i + 2] = arr[n - i + 1] ;
    }
    arr[pos] = key;
    for (int i = 0; i < n + 1; i++)
        printf("%d ", arr[i]);
	return 0;
}
