class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int Left = 0;
        int Right = arr.length - 2;
        int StoreIndex = -1;
        while(Left <= Right){
            int Mid = Left + (Right - Left) / 2;
            if (Mid == arr.length - 1 || arr[Mid] > arr[Mid + 1]){
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