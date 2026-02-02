import java.util.*;

class Solution {

    public int minimumDifference(int[] nums) {

        int n = nums.length;
        int half = n / 2;

        int totalSum = 0;
        for (int x : nums) totalSum += x;

        int[] left = Arrays.copyOfRange(nums, 0, half);
        int[] right = Arrays.copyOfRange(nums, half, n);

       
        ArrayList<Integer>[] leftSums = new ArrayList[half + 1];
        ArrayList<Integer>[] rightSums = new ArrayList[half + 1];

        for (int i = 0; i <= half; i++) {
            leftSums[i] = new ArrayList<>();
            rightSums[i] = new ArrayList<>();
        }
        generateSubsetSums(left, leftSums);
        generateSubsetSums(right, rightSums);
        for (int i = 0; i <= half; i++) {
            Collections.sort(rightSums[i]);
        }

        int ans = Integer.MAX_VALUE;
        for (int k = 0; k <= half; k++) {

            for (int s1 : leftSums[k]) {

                int required = half - k;
                ArrayList<Integer> rList = rightSums[required];
                int target = (totalSum / 2) - s1;
                int idx = Collections.binarySearch(rList, target);

                if (idx < 0) idx = -idx - 1;
                if (idx < rList.size()) {
                    int sumPicked = s1 + rList.get(idx);
                    ans = Math.min(ans, Math.abs(totalSum - 2 * sumPicked));
                }

                if (idx > 0) {
                    int sumPicked = s1 + rList.get(idx - 1);
                    ans = Math.min(ans, Math.abs(totalSum - 2 * sumPicked));
                }
            }
        }

        return ans;
    }
    private void generateSubsetSums(int[] arr, ArrayList<Integer>[] sums) {

        int m = arr.length;

        for (int mask = 0; mask < (1 << m); mask++) {

            int sum = 0;
            int count = 0;

            for (int i = 0; i < m; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                    count++;
                }
            }

            sums[count].add(sum);
        }
    }
}
