class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int result = -1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(letters[mid] <= target) {
                start = mid + 1;
            }
            else {
                result = mid;
                end = mid - 1;
            }
        }

        return result == -1 ? letters[0] : letters[result];
    }
}