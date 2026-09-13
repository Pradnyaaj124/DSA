class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        return search(haystack, needle, 0);
    }

    public int search(String haystack, String needle, int i) {

        // No enough characters left to match needle
        if (i > haystack.length() - needle.length()) {
            return -1;
        }

        // Check whether needle starts at index i
        int j = 0;

        while (j < needle.length()) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                break;
            }
            j++;
        }

        // Entire needle matched
        if (j == needle.length()) {
            return i;
        }

        // Try the next position
        return search(haystack, needle, i + 1);
    }
}