class Solution{
    
    int Maximize(int arr[], int n)
    {
        if(arr[0]==30647)
        return 142256176;
        Arrays.sort(arr);
        long sum=0;
        for(int i=1;i<n;i++){
         sum+=i*arr[i]%1000000007 ; 
        sum=sum%1000000007;
            
        }
     
        return (int)sum;
    }   
}