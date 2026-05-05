class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c , 0) +1);
        }
        for(int i = 0; i<t.length(); i++){
            char c1 = t.charAt(i);
            if(!map1.containsKey(c1)){
                return false;
            }
           // if(map1.containsKey(c1)){
                Integer frq = map1.get(c1);

                if(frq == 1){
                    map1.remove(c1);
                } 
                else{
                    map1.put(c1, frq - 1);
                }

            }
            return map1.isEmpty();
        }
}
       

    

