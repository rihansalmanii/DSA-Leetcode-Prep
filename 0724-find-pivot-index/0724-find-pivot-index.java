class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int i = 0;
        int totalSum = Arrays.stream(nums).sum();

        while(i < nums.length) {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;

            leftSum += nums[i];
            i++;
        }
        return -1;
    }
}