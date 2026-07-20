class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        HashSet<Integer> hashset = new HashSet<>();
      for(int num:nums){
        hashset.add(num);
      }

    
      int longest = 0;
      for(int num:hashset){
        if(!hashset.contains(num-1)){
          int currentNum = num;
          int currentStreak = 1;
        

        while(hashset.contains(currentNum+1)){
            currentNum += 1;
            currentStreak += 1;
        }

        longest = Math.max(longest,currentStreak);
      }

     
      }
       return longest;
    }
}
