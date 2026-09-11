class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int start = 0;
       int end = matrix.length - 1;

       while(start <= end) {
        int mid = start + (end - start)/2;

        if(matrix[mid][0] > target) {
            end = mid - 1;
        }
        else if(matrix[mid][matrix[mid].length - 1] < target) {
            start = mid + 1;
        }
        else {
            int s = 0;
            int e = matrix[mid].length - 1;

            while(s <= e) {
                int m = s + (e - s)/2;

                if(matrix[mid][m] > target) {
                    e = m - 1;
                }
                else if(matrix[mid][m] < target) {
                    s = m + 1;
                }
                else {
                    return true;
                }
            }
            return false;
        }
       }

       return false;
               
    }
}