class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0; int cursum =0;
        Map<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0,1);

        for(int num : nums){
            cursum += num;
            int diff = cursum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(cursum, prefixSums.getOrDefault(cursum, 0) +1);
        }
        return res;
    }
}