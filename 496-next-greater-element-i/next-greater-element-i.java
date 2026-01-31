class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> HelperStack = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            int element = nums2[i];
            while(!HelperStack.isEmpty() && HelperStack.peek()<=element){
                HelperStack.pop();
            }
            if(HelperStack.isEmpty()){
                map.put(element,-1);
            }
              else {
                map.put(element, HelperStack.peek());
            }

            HelperStack.push(element);
        }

      
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
        }
    }
