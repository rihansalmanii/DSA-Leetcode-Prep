class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int majority = -1;
        int occurrence = -1;

        for (int i = 0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > occurrence) {
                majority = nums[i];
            }

            occurrence = Math.max(occurrence, map.get(nums[i]));
            
        }       

        return majority;
    }
}