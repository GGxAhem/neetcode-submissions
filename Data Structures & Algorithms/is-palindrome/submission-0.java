class Solution {
    public boolean isPalindrome(String s) {
    
      StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }

        s = newStr.toString();
        int j = s.length()-1;
        int i =0;
        while(i<=j){
            char l = s.charAt(i);
            char r = s.charAt(j);
            if(l != r){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
