class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) +1);
            }
            //Now we have to perform sorting according to the freq
            //which is the value of..
            List<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());
            l.sort((a, b) -> b.getValue() - a.getValue());
            int arr[] = new int[k];
            for(int i=0; i<k; i++){
                arr[i] = l.get(i).getKey();
//we can not directly get the key frm an arraylist for that we first need
//access the index using get() and then use getKey().
            }
            return arr;
        }
    }
