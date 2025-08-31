class Solution {
    public boolean isPalindrome(int x) {
if (x<0)
            return false; 
        else{
            int h=x; 
            int s=0; 
            while(x>0){
                s=s*10+x%10; 
                x/=10; 
            } 
            if(s==h) 
                return true; 
            else 
                    return false;
        }
      }  
    }
