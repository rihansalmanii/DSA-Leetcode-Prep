class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 0; i<nums.length; i++) {
            int currLen = 0;
            if(map.containsKey(nums[i] + 1)) {
                currLen += map.get(nums[i]) + map.get(nums[i] + 1);
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}