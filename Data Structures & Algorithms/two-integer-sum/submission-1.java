class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n<=0){
            return new int[0];
        }

        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], i));
        }

        for(int i = 0;i<n;i++){
            int find = target - nums[i];
            if(map.containsKey(find) && i!=map.get(find)){
                ans[0] = i;
                ans[1] = map.get(find);
                Arrays.sort(ans);
                return ans;
            }
        }
    
        return new int[0];
    }
}
