class Solution {
    public int totalMoney(int n) {
    int total = 0;
        int mondayAmount = 1;
        int current = mondayAmount;

        for (int day = 1; day <= n; day++) {
            total += current;
            current++;
            if (day % 7 == 0) {
                mondayAmount++;
                current = mondayAmount;
            }
        }

        return total;

    }
}