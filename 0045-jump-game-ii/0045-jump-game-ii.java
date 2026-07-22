class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int a=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            a=Math.max(a,i+nums[i]);
            if(i==end){
                jumps++;
                end=a;

            }
        }
        return jumps;
    }
}