class Solution {
    public void moveZeroes(int[] nums) {
    int n=nums.length;
    int b[]=new int[n];
    for(int i=0, j=0; i<n; i++)
    {
        if(nums[i]!=0){
            b[j++]=nums[i];
        }
    } 
    for(int i=0; i<n; i++){
        nums[i]=b[i];
    }   
    }
}