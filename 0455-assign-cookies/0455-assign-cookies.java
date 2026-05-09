class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0;  // Satisfied Children
        int i = 0;  // Greed Factor
        int j = 0;  // Cookie Size
        while(i < g.length && j < s.length){  // g.length = Total Child & s.length = Cookie Size
        // Check if current cookie size can satisfy current children
            if(g[i] <= s[j]){
                ++count;  // One Children Satisfied
                ++i;   // Move to the next children
                ++j;  // Move to the next cookie
            }
            else{     // If not satisfied by current cookie
                ++j;   // Move to the next cookie
            }
        }
        return count;
    }
}