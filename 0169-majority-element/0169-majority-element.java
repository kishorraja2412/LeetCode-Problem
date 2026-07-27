class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int c=0;
        for(int num : nums){
            if(count==0){
                c=num;
            }
            if(c==num){
                count++;
            }
            else{
                count--;
            }
        }return c;
    }
}