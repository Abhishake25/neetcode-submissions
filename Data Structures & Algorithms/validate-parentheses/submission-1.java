class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }

          else{
            //case 1: if the stack is empty and closing bracket came
            if(stack.isEmpty()){
                return false;
            }
              //case 2
            char top = stack.peek();
            if((c==')' && top=='(') ||
               (c==']' && top=='[') ||
               (c=='}' && top=='{') )
               {
                stack.pop();
               }

               else{
                return false;
               }
          }

    }
              return stack.isEmpty();

}
}
