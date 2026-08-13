class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // ["eat","tea","tan","ate","nat","bat"]

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i<strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
            if(!result.contains(map.get(sorted))) {
                result.add(map.get(sorted));
            }
        }
        return result;
        
    }
}