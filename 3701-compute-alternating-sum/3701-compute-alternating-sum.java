class Solution {
    public int alternatingSum(int[] nums) {
       int even = 0;
       int odd =0;
       int n = nums.length;
       for(int i=0;i<n;i++){
        if(i%2==0){
            even =even+nums[i];
        } else {
            odd = odd +nums[i];
        }
       } 
      return even -odd;
    }
}