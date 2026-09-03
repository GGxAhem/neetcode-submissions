class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
        } 
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            m.put(ch, m.getOrDefault(ch,0)-1);
            if(m.get(ch) == 0){
            m.remove(ch);
           }
        }
        return m.isEmpty();
    }
}