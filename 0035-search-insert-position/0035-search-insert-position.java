class Solution {
    public int searchInsert(int[] nums, int target) { //Iterating through the array
        for (int i = 0; i < nums.length; ++i) {
            if (target <= nums[i])
                return i;
        }
        return nums.length;
    }
}