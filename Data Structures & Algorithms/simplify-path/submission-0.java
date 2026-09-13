class Solution {
    public String simplifyPath(String path) {
        
        String[] words = path.split("/");
         Deque<String> stack = new ArrayDeque<>();
        for(String word:words){
            
            if(word.equals("") || word.equals(".")){
                continue;
            }

            else if(word.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }

            else{
                stack.push(word);
            }
        }

        if(stack.isEmpty()){
            return "/";
        }

        StringBuilder sb = new StringBuilder();
       var iterator = stack.descendingIterator();
       while(iterator.hasNext()){
        sb.append("/").append(iterator.next());
       }
           return sb.toString();
    }
}