class Solution {
    public int mostWordsFound(String[] sentences) {
      int maxl =0;
      for(String s : sentences){
        int sl = s.split(" ").length;
        if(maxl<sl)
        maxl=sl;
      }
      return maxl;
    }
}