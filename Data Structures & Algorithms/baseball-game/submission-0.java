class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for(int i=0; i<operations.length; i++){

            if(operations[i].equals("D")){
                if(!st.isEmpty()){
                int element = st.peek();
                element = element*2;
                st.push(element);
                
                }
            }

            else if(operations[i].equals("C")){

                if(!st.isEmpty()){
                st.pop();
                }
            }

            else if(operations[i].equals("+")){
                if(st.size()>=2){
                int element1 = st.pop();
                int element2 = st.peek();
                int sum = element1 + element2;
                st.push(element1);
                st.push(sum);
                }  
            }
            else{
                st.push(Integer.parseInt(operations[i]));
                
            }
        }

        while(!st.isEmpty()){
            result = result + st.pop();
        }

        return result;
    }
}