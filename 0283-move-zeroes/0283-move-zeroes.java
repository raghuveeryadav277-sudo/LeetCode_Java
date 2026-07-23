class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
       int ans[] = new int[n];
       int start =0 , end = n-1 ;
       for(int i=0 ; i<n ; i++){
        if(nums[i] != 0){
            ans[start++] = nums[i];
        }
        else{
            ans[end--] = nums[i];
        }
       }
       for(int i=0 ; i< n ; i++){
        nums[i] = ans[i];
       }
    }
}