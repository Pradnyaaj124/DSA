class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] arr, int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Find middle
        int mid = si + (ei - si) / 2;

        // Sort left half
        mergeSort(arr, si, mid);

        // Sort right half
        mergeSort(arr, mid + 1, ei);

        // Merge both halves
        merge(arr, si, mid, ei);
    }

    public void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        // Compare left and right parts
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining right part
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}