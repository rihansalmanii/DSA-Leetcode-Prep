class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        HashSet<String> used = new HashSet<>();

        if(pattern.length() != arr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            } else {
                if(used.contains(arr[i])) return false;
            }

            map.put(pattern.charAt(i), arr[i]);
            used.add(arr[i]);
        }
        return true;
    }
}