class Solution {
    public String customSortString(String order, String s) {
        int[] f=new int[26];
        for(char ch:s.toCharArray()){
            f[ch-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:order.toCharArray()){
            while(f[ch-'a']>0){
                ans.append(ch);
                f[ch-'a']--;
            }
        }
            for(int i=0;i<26;i++){
                while(f[i]>0){
                    ans.append((char)(i+'a'));
                    f[i]--;
                }
            }
        return ans.toString();
    }
}