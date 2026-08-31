class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n<=0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i], i);
        }
        int maxLen = 0;
        for(int i = 0;i<n;i++){
            int len = 1;
            int next = nums[i]+1;
            int prev = nums[i]-1;
            while(map.containsKey(next) && map.get(next) > i){
                len++;
                next++;
            }

             while(map.containsKey(prev) && map.get(prev) > i){
                len++;
                prev--;
            }
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
