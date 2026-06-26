class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        long totalSum = 0;
        int count = 0;
        int n = nums.length;

        for(int num: nums) {
            totalSum += num;
        }

        for(int i = 0; i< nums.length-1; i++) {
            sum += nums[i];
            if(sum >= totalSum - sum) {
                count++;
            }
        }

        return count;
    }
}