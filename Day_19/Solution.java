class Solution{
    public List<Integer> pattern(int N){
         ArrayList<Integer> ans=new ArrayList<>();
        int k=N;
        ans.add(k);
        while(k>0)
        {
         
          k=k-5;
           ans.add(k);
        }
        while(k<=N)
        {
            if(k==N)
             return ans;
            k=k+5;
            ans.add(k);
        }
        return ans;
    }
}