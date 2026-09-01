class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if(n<1){
            return new int[0];
        }
        int ans[] = new int[2];
        for(int i = 0;i<n;i++){
            int toFind = target - nums[i];
            int idx = binarySearch(nums, toFind);
            if(idx != i && idx != -1){
                ans[0] = Math.min(i + 1, idx + 1);
                ans[1] = Math.max(i + 1, idx + 1);
                return ans;
            }
        }

        return new int[0];
        
    }

    private int binarySearch(int[] nums, int target){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid = i + (j - i)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return -1;
    }
}