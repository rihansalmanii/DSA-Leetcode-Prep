class Solution {
    public char findTheDifference(String s, String t) {
       char result = 'a';

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(int i = 0; i<t.length(); i++) {
            if(i < s.length()) {
            m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0) + 1);
            }
            m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(m1.get(t.charAt(i)) != m2.get(t.charAt(i))) {
                result = t.charAt(i);
            }
        }
        return result;
    }
}