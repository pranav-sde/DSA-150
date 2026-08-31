class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        if(n<=0){
            return new int[0];
        }

        int product = 1;
        int cntZero = 0;
        for(int i = 0;i<n ;i++) {
            if(nums[i] == 0) {
                cntZero++;
                continue;
            }
            product *= nums[i];
        }

        int ans[] = new int[n];

        if(cntZero >1){
            return ans;
        }

        if(cntZero == 1){
            for(int i = 0;i<n;i++){
                if(nums[i] == 0){
                    ans[i] = product;
                }
            }
            return ans;
        }

        for(int i = 0;i<n;i++){
            ans[i] = product/nums[i];
        }

        return ans; 
    }
}  
