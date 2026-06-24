class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int totalSum = 0;
        int n = nums.length;
        int leftSum = 0;


        for(int i = 0; i<nums.length; i++) {
            totalSum += nums[i];
        }

        for(int i = 0; i<nums.length; i++) {
            int left = nums[i]*i - (i > 0 ? leftSum : 0);
            int right = (totalSum - leftSum - nums[i]) - nums[i]*(n-i-1);

            result[i] = left+right;
            leftSum += nums[i];
        }

        return result;
    }
}