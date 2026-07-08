class Solution {
    public void moveZeroes(int[] nums) {
        int J = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[J] = nums[i];
                J++;
            }
        }
        
        while (J < nums.length) {
            nums[J] = 0;
            J++;
        }
    }
}
