class Solution {
    public int findClosest(int x, int y, int z) {
int p13= Math.abs(x-z);
int p23 = Math.abs(y-z);
if(p13<p23) return 1;
else if(p13>p23) return 2;
else return 0;



    }
}