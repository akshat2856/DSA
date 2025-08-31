class Solution {
    public boolean isPalindrome(int x) {
      String str = Integer.toString(x);
      
    //  char[] arr = str.toCharArray();
    //   int left = 0, right = arr.length - 1;
    //     while (left < right) {
    //         char temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
       
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);  
        }

       
        // String reversed = new String(arr);

        if(str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
      }  
    }
