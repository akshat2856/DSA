class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
        List<Integer> list = new ArrayList<>();
        char[] arr =  s1.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        for(int i=0;i<=s2.length()-s1.length();i++){
        StringBuilder pq = new StringBuilder(s2.substring(i,s1.length()+i));
        char[] chh =  pq.toString().toCharArray();
        Arrays.sort(chh);
        pq = new StringBuilder(new String(chh));
        if(sb.toString().equals(pq.toString()))list.add(i);
        }
        return list;
    }
}