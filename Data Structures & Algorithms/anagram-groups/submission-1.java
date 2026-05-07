class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            anagram.putIfAbsent(sorted, new ArrayList<>());
            anagram.get(sorted).add(s);
        }
        return new ArrayList<>(anagram.values());
    }
}
