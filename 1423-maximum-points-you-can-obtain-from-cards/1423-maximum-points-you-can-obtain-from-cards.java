class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = k-1;
        int r = cardPoints.length - 1;
        int sum = 0;

        for(int i=0; i<=l; i++) {
            sum += cardPoints[i];
        }

        int maxSum = sum;

        while(l >= 0) {
            sum = sum - cardPoints[l] + cardPoints[r];
            maxSum = Math.max(maxSum, sum);
            l--;
            r--;
        }

        return maxSum;
    }
}