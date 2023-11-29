class  Solution
{
    void shuffleArray(long arr[], int n)
    {
       // Your code goes here
        int j = n/2 , count = 0;
        long ls[] = new long[n];
        for(int i = 0 ; i < n/2 ; i++,j++)
        {
            ls[count++] = arr[i];
            ls[count++] = arr[j];
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = ls[i];
        } 
    }
}
