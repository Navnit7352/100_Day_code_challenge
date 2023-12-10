class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
         Arrays.sort(a);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(k==0)
            break;
             if(a[i]>=0)
            break;
            if(a[i]<0)
            {
                a[i] *= -1;
                k--;
            }
           
        }
        if(k!=0)
        {
            int j=0;
            Arrays.sort(a);
            while(k!=0)
            {
              a[0]=-a[0];
              k--;
            }
        }
        
        for(int i=0;i<n;i++)
        sum+=a[i];
        return sum;
    }
}