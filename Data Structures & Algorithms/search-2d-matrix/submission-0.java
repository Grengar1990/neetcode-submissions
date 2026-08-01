class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) return false;

        for (int i = 0; i < matrix.length; i++) {

            if (target > matrix[i][matrix[i].length - 1]) continue;
    
            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {
                int mid = left + ((right - left) / 2);
                if (target == matrix[i][mid]) return true;
                if (target < matrix[i][mid])
                    right = mid - 1;
                else left = mid + 1;
            }
            break;
        }

        return false;
    }
}
