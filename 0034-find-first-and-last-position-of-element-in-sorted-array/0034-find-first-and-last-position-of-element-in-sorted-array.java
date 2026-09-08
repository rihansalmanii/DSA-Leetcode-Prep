class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[] {-1, -1};

        int index1 = Integer.MAX_VALUE;
        int index2 = Integer.MIN_VALUE;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                index1 = Math.min(index1, mid);
                end = mid - 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }

        if(index1 == Integer.MAX_VALUE) index1 = -1;

        int start2 = 0; 
        int end2 = nums.length - 1;
            while(start2 <= end2) {
                int mid2 = start2 + (end2 - start2)/2;

                if(nums[mid2] == target) {
                    index2 = Math.max(index2, mid2);
                    start2 = mid2 + 1;
                }
                else if(nums[mid2] < target) {
                    start2 = mid2 + 1;
                }
                else {
                    end2 = mid2 - 1;
                }
            }

            if(index2 == Integer.MIN_VALUE) index2 = -1;

        return new int[] {index1, index2};
    }
}