class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        int leftsum =0;
        for (int i =0; i<nums.length; i++) {
            if (leftsum == (sum - leftsum - nums[i]) ) {
                return i;
            }
            leftsum = leftsum+nums[i];
        }
        return -1;
    }
}