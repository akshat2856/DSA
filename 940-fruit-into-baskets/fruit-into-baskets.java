class Solution {
    public int totalFruit(int[] fruits) {
       int i = 0;
       int j =0;
       int max = 0;
       HashMap<Integer,Integer> map =new HashMap<>();
       while(j<fruits.length){
          map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
        //   if(map.size()<2)j++;

          if(map.size()<=2){
            max = Math.max(max,j-i+1);
            j++;
          }
          else if(map.size()>2){
            while(map.size()>2){
            int a = fruits[i];
            map.put(a,map.get(a)-1);
            if(map.get(a)==0)map.remove(a);
            i++;
            }
            j++;
          }
       } 
       return max;
    }
}