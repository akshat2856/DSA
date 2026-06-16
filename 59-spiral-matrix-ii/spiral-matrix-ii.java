class Solution {
    public int[][] generateMatrix(int n) {
    int[][] answer = new int[n][n];
    int top =0;
    int bottom = answer.length-1;
    int left = 0;
    int right = answer[0].length-1;
    int count = 1;
    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            answer[top][i] = count++;
        }
        top++;
        for(int i=top ; i<=bottom;i++){
            answer[i][right] = count++;
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                answer[bottom][i] = count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                answer[i][left] = count++;
            }
            left++;
        }
     }
    return answer;
   }
}