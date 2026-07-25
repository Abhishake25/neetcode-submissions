class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxLength = 0;
        int windowSize = 0;
        int replacement = 0;
        for(int right=0; right<s.length(); right++){
            //step 1
            char ch = s.charAt(right);
            //step 2
            map.put(ch,map.getOrDefault(ch,0)+1);

            //step 3
             maxFreq = Math.max(maxFreq,map.get(ch));

            

            while((right-low+1)-maxFreq>k){
                char leftChar = s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                low++;
            }
             
             maxLength = Math.max(maxLength,right-low+1);
             
        }
        return maxLength;
    }
}
