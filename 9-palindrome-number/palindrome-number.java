class Solution {
    public boolean isPalindrome(int x) {
if (x<0)
            return false; 
        else{
            int h=x; 
            int s=0; 
            while(h>0){
                s=s*10+h%10; 
                h/=10; 
            } 
            if(s==x) 
                return true; 
            else 
                    return false;
        }
      }  
    }
