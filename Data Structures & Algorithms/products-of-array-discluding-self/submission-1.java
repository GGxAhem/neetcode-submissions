class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        //int pre[] = new int[n];
        //int suff[] = new int[n];
        int res[] = new int[n];
       int pre = 1;
       res[0] = 1;
        for(int i=1; i<n; i++){
            //pre[i] = pre[i-1] * nums[i-1];
            pre = pre * nums[i-1];
            res[i] = pre;
        }
        System.out.println(Arrays.toString(res));
        //suff[n-1] = 1;
        int suff = 1;
        for(int i= n-2; i>=0; i--){
          //  suff[i] = suff[i+1] * nums[i+1];
            suff = suff * nums[i+1];
            res[i] = res[i] * suff;
        }
        // for(int i=0; i<n; i++){
        //     res[i] = suff[i] * pre[i];
        // }
        return res;
    }
}  
