class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        if(n<=0){
            return -1;
        }

        int i = 0;
        int j = n-1;
        int maxArea = 0;
        while(i<j){
            int width = j - i;
            int len = Math.min(heights[i], heights[j]);
            int area = width * len;
            maxArea = Math.max(maxArea, area);
            if(heights[i] <= heights[j]){
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
