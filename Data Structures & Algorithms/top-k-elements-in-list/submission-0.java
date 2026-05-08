class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+ 1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(map.entrySet());
        l.sort((a,b) -> b.getValue() - a.getValue());
        //It is sorted in descending order according to the frequecy/value of map.
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = l.get(i).getKey();
        }
        return arr;
    }
}
