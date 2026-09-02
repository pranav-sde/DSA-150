class Solution {
    public int trap(int[] height) {
        //0,2,0,3,1,0,1,3,2,1
    //pge 0,2,2,3,3,3,3,3,3,3
    //nge 3,3,3,3,3,3,3,3,2,1
        int n = height.length;
        if(n<=0){
            return 0;
        }

        int[] pge = new int[n];
        int prev = height[0];
        pge[0] = prev;
        for(int i = 1;i<n;i++){
            if(prev<height[i]){
                prev = height[i];
            }
            pge[i] = prev;
        }

        int[] nge = new int[n];
        int next = height[n-1];
        for(int i= n-1;i>=0;i--){
            if(next<=height[i]){
                next = height[i];
            }

            nge[i] = next;
        }
        int cnt = 0;

        for(int i = 0;i<n;i++){
            int min = Math.min(pge[i], nge[i]);
            cnt += (min - height[i]);
        }
        return cnt;
    }
}
