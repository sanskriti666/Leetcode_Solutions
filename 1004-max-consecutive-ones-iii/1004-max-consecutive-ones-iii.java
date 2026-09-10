class Solution {
    public int longestOnes(int[] nums, int k) {
      int max = 0;
     int s = 0; int e =0;
     int z = 0;
     while(e<nums.length){
        int num = nums[e];
        if(num == 0) z++; // window main include krna 
        // window shrink
        while(z>k){
            int st = nums[s];
            if(st == 0) z--;
            s++;
        }
        int size = e-s+1;
        max = Math.max(max,size);
        e++;
     }
      return max;
    }
}