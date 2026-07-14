class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int r =0;
        int size = 0;
        int maxsize = 0;
        HashSet<Character> freq = new HashSet<>();
        while(r < s.length()){
            if(!freq.contains(s.charAt(r))){
                size ++;
                freq.add(s.charAt(r));
                r++;
                maxsize = Math.max(maxsize, size);
            }
            else if(freq.contains(s.charAt(r))){
                size --;
                freq.remove(s.charAt(l));
                l++;
            }
            
        }
        return maxsize;
    }
}
