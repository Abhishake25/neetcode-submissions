class Solution {

    public String encode(List<String> strs) {
          StringBuilder sb = new StringBuilder();

          for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
          }
          return sb.toString();
    }

    public List<String> decode(String str) {
         
         List<String> result = new ArrayList<>();
         int i = 0;
         while(i<str.length()){
            //step 1
            int j = i;

            //step 2
               while(str.charAt(j)!='#'){
                j++;
               }

            //step 3
            int length = Integer.parseInt(str.substring(i,j));

            //step 4
            int wordStart = j+1;
            int wordEnd = wordStart + length;

            //step 5
            String word = str.substring(wordStart,wordEnd);
             result.add(word);
            //step 6
            i = wordEnd;
         }

         return result;
    }
}
