class Solution {
    public int maxProduct(int n) {
        int f =0;
        int s =0;
        while(n>0){
            int last= n%10;
            if(last>f){
                s=f;
                f=last;
            } else if(last>s){
                s=last;
            } 
            n=n/10;
        }
        return f*s;


    }
}