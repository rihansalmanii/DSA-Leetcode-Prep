class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int n: nums1) {
            set.add(n);
        }

        for(int n: nums2) {
            if(set.remove(n)) list.add(n);
        }

        int[] result = new int[list.size()];

        for(int i = 0; i<result.length; i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}