class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int reversePosition = 'z' - ch + 1;

            int stringPosition = i + 1;

            sum += reversePosition * stringPosition;
        }

        return sum;
    }
}