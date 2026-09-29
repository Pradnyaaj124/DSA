class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                // mid * mid <= x
                ans = mid;
                left = mid + 1;
            } 
            else {
                // mid * mid > x
                right = mid - 1;
            }
        }

        return ans;
    }
}