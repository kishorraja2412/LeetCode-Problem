class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int t = x;
        int p=0;
        while(x!=0){
            int l=x%10;
            p=p*10+l;
            x=x/10;
        }
        if(p==t){
            return true;
        }
        return false;
    }
}