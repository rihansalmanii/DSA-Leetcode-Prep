class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int i=0;
        while(i<nums.length) {
            if(i>0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            };
            int j=i+1;
            while(j<nums.length) {
                int p = j+1;
                int q = nums.length-1;

                while(p<q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++; q--;

                        while(p<q && nums[p] == nums[p-1]) p++;
                         while(p<q && nums[q] == nums[q+1]) q--;
                    } else if(sum > target) q--;
                    else p++;
                }
                j++;
                while(j<nums.length && nums[j] == nums[j-1]) j++;
            }
            i++;
        }
        return res;
    }
}