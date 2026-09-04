/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int firstBad = n;

        while(start <= end) {
            int version = start + (end - start)/2;
            
            if(isBadVersion(version)) {
                firstBad = Math.min(version, firstBad);
                end = version - 1;
            }
            else {
                start = version + 1;
            }
        }

        return firstBad;
    }
}