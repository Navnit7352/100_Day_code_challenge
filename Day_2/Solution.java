class Solution{
    int columnWithMaxZeros(int arr[][],int N){
        int max_z=0;
        int res=-1;
        for(int i=0; i<N; i++){
            int currz=0;
            for(int j=0; j<N; j++){
                currz++;
            }
            if(currz>max_z){
                res=i;

            }
            max_z=Math.max(currz,max_z);
        }
        return res;
    }
}