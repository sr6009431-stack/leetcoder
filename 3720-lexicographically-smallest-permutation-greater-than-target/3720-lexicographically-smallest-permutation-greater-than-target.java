class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] sCount = new int[26];
        for(char c: s.toCharArray()){
            sCount[c-'a']++;
        }

        for(int i=n-1;i>=0;i--){
            int[] prefixCount = new int[26];
            boolean possible =true;
            for(int k=0;k<i;k++){
                int charIdx = target.charAt(k)-'a';
                prefixCount[charIdx]++;
                if(prefixCount[charIdx]>sCount[charIdx]){
                    possible = false;
                    break;
                }
            }
            if(!possible) continue;
int[] remcount = new int[26];
for(int c=0;c<26;c++){
    remcount[c]=sCount[c]-prefixCount[c];
}
int targetChar = target.charAt(i) - 'a';
for(int c= targetChar+1;c<26;c++){
    if(remcount[c]>0){
        StringBuilder sb = new StringBuilder();
        sb.append(target.substring(0,i));
        sb.append((char)('a'+c));
        remcount[c]--;

        for(int ch =0;ch<26;ch++){
            while (remcount[ch]>0){
                sb.append((char)('a'+ch));
                remcount[ch]--;
            }
        }
        return sb.toString();
    }
}

        }
        return "";
    }
}