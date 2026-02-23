class Solution {
    public int[] twoSum(int[] numbers, int target) {
         return search(numbers, 0, target);
    }
      static int[] search(int[] arr, int low, int target) {
        if (low >= arr.length - 1)
            return new int[]{-1, -1};
        int complement = target - arr[low];
        int index = binarySearch(arr, low + 1, arr.length - 1, complement);
        if (index != -1) {
            return new int[]{low + 1, index + 1};
        }
        return search(arr, low + 1, target);
    }
     static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        else
            return binarySearch(arr, mid + 1, high, target);
    }
}