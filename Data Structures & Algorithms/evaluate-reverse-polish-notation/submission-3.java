class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       int element1=0;
       int element2=0;

       for(int i=0; i<tokens.length; i++){

        //case 1:
        if(tokens[i].equals("+")){
            if(stack.size()>=2){
             element1 = stack.pop();
             element2 = stack.pop();
             int sum = element1 + element2;
             stack.push(sum);
            }
        }

        //case 2:
        else if(tokens[i].equals("-")){
            if(stack.size()>=2){
             element1 = stack.pop();
             element2 = stack.pop();
             int sub = element2 - element1;
             stack.push(sub);
            }
        }

        //case 3:
        else if(tokens[i].equals("*")){
            if(stack.size()>=2){
             element1 = stack.pop();
             element2 = stack.pop();
             int mul = element1 * element2;
             stack.push(mul);
            }
        }

        //case 4:
       else if(tokens[i].equals("/")){ 
            if(stack.size()>=2){
             element1 = stack.pop();
             element2 = stack.pop();
             int div = element2 / element1;
             stack.push(div);
            
            }
        }

        else{
            stack.push(Integer.parseInt(tokens[i]));
        }
       } 
       return stack.peek();
    }
}
