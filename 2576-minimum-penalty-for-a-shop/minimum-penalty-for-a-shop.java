class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int penalty = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y') {
                penalty++;
            }
        }
        int minPenalty = penalty;
        int bestHour = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                penalty--;
            } else { 
                penalty++;
            }
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }
        return bestHour;
    // int n = customers.length();
    // int min_penalty = Integer.MAX_VALUE;
    // int ind = n;
    // int k = n; 
    // while (k >= 0)
    // {
    //     int penalty = 0; 

    //     for (int i = 0; i < n; i++) 
    //     {
    //         if (i < k)
    //         {
    //             if (customers.charAt(i) == 'N')
    //             {
    //                 penalty += 1;
    //             }
    //         }
    //         else
    //         {
    //             if (customers.charAt(i) == 'Y')
    //             {
    //                 penalty += 1;
    //             }
    //         }
    //     }
    //     if (penalty <= min_penalty)
    //     {
    //         min_penalty = penalty;
    //         ind = k;
    //     }
    //     k--; 
    // }

    // return ind;
    }
}
