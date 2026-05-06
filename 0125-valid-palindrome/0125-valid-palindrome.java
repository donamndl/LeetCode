class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){  //If the character is not a letter or a digit then skip it and move forward to the next character from the left
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){  //If the character is not a letter or a digit then skip it and move forward to the next character from the right
                right--;
            }
            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}