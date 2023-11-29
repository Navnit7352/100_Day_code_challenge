class Solution{
    public static String printMinNumberForPattern(String pattern){
        int n=pattern.length();
        int[] result=new int[n];

        for(int i=0; i<n; i++){
            result[i]=i+1;
        }

        for(int i=0; i<n-1; i++){
            if(pattern.charAt(i)=='D'){
                int start=i;
                while (i<n-1 && pattern.charAt(i)=='D') {
                    i++;
                }
                reverse(result,start,i);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int num:result){
            sb.append(num);
        }
        return sb.toString();
    }
    private static void reverse(int[] arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[start];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}