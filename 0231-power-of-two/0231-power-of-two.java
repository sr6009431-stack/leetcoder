class Solution {
    public boolean isPowerOfTwo(int n) {
    //   int cnt=0;
    //  while(n>0){
    //     if(n%2==1){
    //         cnt++;
    //      } n=n/2;
        
    //      }
    //       if(cnt ==1)
    //         return true;
    //     return false;
    if(n<=0)return false;
    while(n>1){
        if(n%2!=0) return false;
        n=n/2;
    }
     return true;
    }
}