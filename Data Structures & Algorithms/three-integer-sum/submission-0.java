class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         // a+b+c = 0 , a+b = -c
        int n = nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int k = 0;k<n;k++){
            if (k > 0 && nums[k] == nums[k-1]) continue;
            twoSum(nums, -nums[k], k, ans);
        }

        return ans;
    }

    private void twoSum(int nums[], int target, int k, List<List<Integer>> ans){
        int n = nums.length;
        int i = k + 1;
        int j = n-1;

        while(i<j) {
            int sum = nums[i] + nums[j];
            if(sum == target){
                ans.add(Arrays.asList(nums[k], nums[i], nums[j]));
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;
                i++; j--;
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}