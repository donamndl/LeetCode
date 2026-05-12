class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String pref = strs[0];
        int prefix = pref.length();

        for(int i = 1; i < strs.length; i++){
            String s = strs[i];
            while(prefix > s.length() || !pref.equals(s.substring(0, prefix))){
                prefix--;
                if(prefix == 0){
                    return "";
                }
                pref = pref.substring(0, prefix);
            }
        }
        return pref;
    }
}