class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int sum =0;
  for (int[]grid: accounts){
     int maxwealth=0;
     for(int money : grid){
        maxwealth +=money;
     }
  
  sum = Math.max(sum,maxwealth);
  }
 return sum;
    }
}