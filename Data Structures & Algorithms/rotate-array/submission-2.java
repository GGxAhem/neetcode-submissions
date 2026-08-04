class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        Stack<Integer> s = new Stack<>();
        int arr [] = new int[nums.length];
        for (int i = nums.length - 1; i >= nums.length - k; i--){
            s.push(nums[i]);
        }
        for(int i=0; i<arr.length; i++){
            if(i< k){
                arr[i] = s.pop();
            }
            else{
                arr[i] = nums[i-k];
            }
        }
        for (int i = 0; i < nums.length; i++) {
    nums[i] = arr[i];
}
    }
}