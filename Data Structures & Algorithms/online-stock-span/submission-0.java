class Pair{
    int price;
    int span;

    public Pair(int price,int span){
       this.price = price;
       this.span = span;
    }
}

class StockSpanner {
    private Stack<Pair> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {        
        int span = 1;
        while(stack.isEmpty()==false && stack.peek().price<=price){
            span = span + stack.peek().span;
          stack.pop();
        }
             stack.push(new Pair(price,span));
             return span;

        }

    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */