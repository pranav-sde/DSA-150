class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<=0){
            return false;
        }
        int prev = nums[0];
        for(int i =1;i<nums.length;i++){
            if (prev == nums[i]){
                return true;
            }
            prev = nums[i];
        }

        return false;
    }
}