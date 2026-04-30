class Solution {
    public boolean isPalindrome(String s) {
     s =   s.toLowerCase();
     StringBuilder sb = new StringBuilder("");
     int n = s.length();
     for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if('a'<= ch && ch <= 'z')
            sb.append(ch);
        else if('0'<=ch && ch<='9')
            sb.append(ch);

     }
        int left = 0, right =sb.length()-1;
        while(left<= right){
            if(sb.charAt(left)!= sb.charAt(right)){

                return false;
                           }               left++;
                right--;
            
        }

     
     return true;
    }
}