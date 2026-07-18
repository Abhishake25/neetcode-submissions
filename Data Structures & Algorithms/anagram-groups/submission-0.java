class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s: strs){

            char[] chars = s.toCharArray();  //divide the string into character array like{"act"} into {'a','c','t'}
            Arrays.sort(chars);  //sort the character array like {'t','o','p','s'} into {'s','t','o','p'}
            String sortedWord = String.valueOf(chars);  //again convert the character array back to string {'stop'}

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }

            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
