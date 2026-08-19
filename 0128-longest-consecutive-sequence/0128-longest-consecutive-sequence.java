class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        int sequence = 1;

        for(int i = 0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int n: set) {
            if(!set.contains(n - 1)) {
                sequence = 1; 
                int current = n;

                while(set.contains(n + 1)) {
                    sequence++;
                    n++;
                }
            }

            maxLen = Math.max(maxLen, sequence);
        }

        return maxLen;
    }
}