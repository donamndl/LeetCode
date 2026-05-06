class Solution {
    public int searchInsert(int[] nums, int target) { //Iterating through the array
        int Left = 0;
        int Right = nums.length - 1;
        int StoreIndex = -1;
        while(Left <= Right){
            int Mid = Left + (Right - Left) / 2;
            if(nums[Mid] >= target){
                StoreIndex = Mid;
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }
        return StoreIndex != -1 ? StoreIndex : nums.length;  
    }
}