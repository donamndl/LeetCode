class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0])); //Sorting interval ascending order with respect to start time
        int CurrentStart = intervals[0][0]; //1
        int CurrentEnd = intervals[0][1]; //3

        ArrayList<int[]> mergeInterval = new ArrayList<>();
        for(int i = 1; i < intervals.length; ++i){
            int NextStart = intervals[i][0]; //2
            int NextEnd = intervals[i][1]; //6

            // if it is found non-overlapping
            if(CurrentEnd < NextStart){
                mergeInterval.add(new int[]{CurrentStart, CurrentEnd});
                CurrentStart = NextStart;
                CurrentEnd = NextEnd;
            }
            else{
                CurrentEnd = Math.max(CurrentEnd, NextEnd);
            }
        }
        
        // CurrentEnd has been updated as it overlapped
            mergeInterval.add(new int[]{CurrentStart, CurrentEnd});
            return mergeInterval.toArray(new int[mergeInterval.size()][]);
    }
}