class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int result = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] <= arr[mid+1]) {
                start = mid + 1;
            }
            else {
                result = arr[result] > arr[mid] ? result : mid;
                end = mid - 1;
            }
        }
        return result;
    }
}