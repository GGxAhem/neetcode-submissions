class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int i = 0;
        int r = nums.length-1;

        while(l <= r){
            if(nums[l] == 1){
                l++;
            }else if (nums[l] == 0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                i++;
                l++;
            }else if (nums[l] == 2){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
            }
        }

        
    }
}