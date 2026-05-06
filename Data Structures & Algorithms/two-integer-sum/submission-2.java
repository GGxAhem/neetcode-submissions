class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Use HashMap to store arrays values as Keys and indexs as values.
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            //Take the differece and search it in the Hashmap if found 
            //return array containing value of difference and current index(i) directly
            int diff = target - nums[i];
            if(h1.containsKey(diff)){
                return new int []{h1.get(diff), i} ;
            }
            //This is the line where we are storing the Key and value taking from array.
            h1.put(nums[i], i);
        }
    return new int [] {0};
 }
}
