class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int result = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if((long) mid*mid == x) {
                return mid;
            }
            else if((long) mid*mid < x) {
                result = Math.max(mid, result);
                start = mid + 1;

            } 
            else {
                end = mid - 1;
            }
        }

        return result;
    }
}