class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
int n=nums.length;
int ans=0;

for(int i=0;i<n;i++){
    int targetcount=0;
    for(int j=i;j<n;j++){
        if(nums[j]==target){
            targetcount++;
        }
        int len =j-i+1;
        if(targetcount>len/2){
            ans++;
        }
    }
}
return ans;

    }
}