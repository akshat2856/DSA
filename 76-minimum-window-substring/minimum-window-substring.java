class Solution {
    public String minWindow(String s, String t) {
     HashMap<Character, Integer> map = new HashMap<>();

for (int i = 0; i < t.length(); i++) {
    map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
}

int cntt = map.size();  
int j = 0;
int min = Integer.MAX_VALUE;
int start = 0;

for (int k = 0; k < s.length(); k++) {
    if (map.containsKey(s.charAt(k))) {
        map.put(s.charAt(k), map.get(s.charAt(k)) - 1);
        if (map.get(s.charAt(k)) == 0) {
            cntt--;
        }
    }
    while (cntt == 0) {
        if (k - j + 1 < min) {
            min = k - j + 1;
            start = j;
        }

        if (map.containsKey(s.charAt(j))) {
            map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            if (map.get(s.charAt(j)) > 0) {
                cntt++;
            }
        }
        j++;
    }
}
 String ans = (min == Integer.MAX_VALUE) ? "" : s.substring(start, start + min);
return ans;
    }
}