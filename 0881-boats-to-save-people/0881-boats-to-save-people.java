class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        int count=0;
        while(i<=j){
                if(people[i]+people[j]<=limit){
                    i+=1;
                    j-=1;
                    count+=1;
                }
                else{
                    j-=1;
                    count+=1;
                }
            }
     return count;  
    }
}