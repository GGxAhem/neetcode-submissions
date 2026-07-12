class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();

        for(Integer num : nums){
            if(dup.contains(num)){
                return true;
            }
            else{
                dup.add(num);
            }

        }
        return false;
    }
}