class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int k = s.length;
        Arrays.sort(s);
        Arrays.sort(g);
        int cnt = 0;
        int i=0;
        int j=0;
        while(i<n && j<k){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}