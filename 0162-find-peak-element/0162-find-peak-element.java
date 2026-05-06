class Solution {
    public int findPeakElement(int[] nums) {
        int Left = 0;
        int Right = nums.length - 1;
        int StoreIndex = -1;
        while(Left <= Right){
            int Mid = Left + (Right - Left) / 2;
            if (Mid == nums.length - 1 || nums[Mid] > nums[Mid + 1]){
                StoreIndex = Mid;
                Right = Mid - 1;
            }
            else{
                Left = Mid + 1;
            }
        }
        return StoreIndex;      
    }
}