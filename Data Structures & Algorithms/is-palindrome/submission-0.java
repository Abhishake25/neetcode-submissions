class Solution {
    public boolean isPalindrome(String s) {
        String word = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

if(word.isEmpty()){
    return true;
}
        char[] chars = word.toCharArray();
        int n = chars.length;
           int i = 0;
           int j = n-1;
            while(i<=j){
            if(chars[i]==chars[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
