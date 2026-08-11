class Solution {
    public char findTheDifference(String s, String t) {
       char result = 'a';

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(char c: s.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }

        System.out.println(m1);
        System.out.println(m2);

        for(int i = 0; i < t.length(); i++) {
            if(m1.get(t.charAt(i)) != m2.get(t.charAt(i))) {
                result = t.charAt(i);
            }
        }
        return result;
    }
}