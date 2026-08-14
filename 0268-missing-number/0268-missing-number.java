class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] < nums.length && !set.contains(nums[i] + 1)) {
                return nums[i] + 1;
            }
        }

        return 0;
    }
}