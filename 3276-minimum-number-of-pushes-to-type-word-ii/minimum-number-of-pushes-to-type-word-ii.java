class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] vis = new int[26];
        for(int i=0;i<n;i++){
            vis[word.charAt(i)-'a']++;
        }
        int i=0;
        int cnt = 0;
        int sum = 0;
        Arrays.sort(vis);
        for(int j=25;j>=0;j--){
            if(vis[j]==0)continue;
                sum+=(i/8+1)*vis[j];
                i++;
        }
        return sum;
    }
}