class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       int n = nums1.length;
        int m = nums2.length;
        int max = Integer.MIN_VALUE;
        int result = solve(nums1,nums2,n,m,max);
        return result;
    }
    public int solve(int[] s1,int[] s2,int n,int m,int max){
        int[][] t = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            t[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            t[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
              if(s1[i-1]==s2[j-1]) max = Math.max(max,t[i][j] = 1+t[i-1][j-1]);
              else t[i][j] = 0;
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
    }
