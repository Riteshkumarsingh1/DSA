/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // search in descending part
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private int findPeakIndex(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // descending part
                end = mid;
            } else {
                // ascending part
                start = mid + 1;
            }
        }
        return start; // or end, both same
    }

    private int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) return mid;

            if (isAsc) {
                if (target < midVal) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midVal) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
