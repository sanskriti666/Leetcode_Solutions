class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum=0;
        for(int i=0; i<k ; i++)sum=sum+arr[i];
        double maxsum=sum;
        for(int i=k; i<arr.length; i++){
          sum+=arr[i]-arr[i-k];
            maxsum =Math.max(sum,maxsum);
        }
        return maxsum/k;
    }
}