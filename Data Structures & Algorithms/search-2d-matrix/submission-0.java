class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if(n<=0)
            return false;
        
        int m = matrix[0].length;
        int row = 0;
        for(int i = 0;i<n;i++){
            if(target<=matrix[i][m-1]){
                row = i;
                break;
            }
        }

        int i = 0;
        int j = m-1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(matrix[row][mid] == target){
                return true;
            } else if(matrix[row][mid] < target){
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return false;
    }
}
