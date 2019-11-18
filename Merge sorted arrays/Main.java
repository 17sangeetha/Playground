int main() 
{
	int m, n;
	scanf("%d %d", &m, &n);
	int array1[m], array2[n], array3[m + n], k = 0, i = 0, j = 0;
	for(int i = 0;i < m ;i++)
	{
	    scanf("%d", &array1[i]);
	}
	for(int j = 0; j < n; j++)
	{
	    scanf("%d", &array2[j]);
	}
	 while (i < m && j < n) 
        {
            if (array1[i] < array2[j]) 
            {
                array3[k] = array1[i];
                i++;
            }
 
            else 
            {
                array3[k] = array2[j];
                j++;
            }
            k++;
        }
 
        if (i >= m) 
        {
            while (j < n) 
            {
                array3[k] = array2[j];
                j++;
                k++;
            }
        }
 
        if (j >= n) 
        {
            while (i < m)
            {
                array3[k] = array1[i];
                i++;
                k++;
            }
        }
	for(int i = 0; i < (m + n); i++)
	{
	    printf("%d ", array3[i]);
	}
	return 0;
}
