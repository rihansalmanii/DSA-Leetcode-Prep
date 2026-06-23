class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int sum = 0;
        int n = nums.length;

        prefix[0] = nums[0];

        for(int i = 1; i<nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i<nums.length; i++) {
            int left = nums[i]*i - (i > 0 ? prefix[i-1] : 0);
            int right = (prefix[n-1] - prefix[i]) - nums[i]*(n-i-1);

            result[i] = left+right;
        }

        return result;
    }
}