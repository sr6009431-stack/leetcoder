class Solution {
    public String getSmallestString(String s, int k) {
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        int val = Math.min(123-c,c-97);
        if(k>0){
            if(val<=k){
                sb.append("a");
                k-=val;
            } else {
                c = (char)(c-k);
                sb.append(c);
                k-=val;
            }
        } else {
            sb.append(c);

        }
      }
      return sb.toString(); 
    }
}