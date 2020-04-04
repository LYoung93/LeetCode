import java.util.Stack;

/**
 * @author liuyang
 * @date 2020/3/7 - 16:23
 */
public class Code02 {
   private Stack<Integer> stack;
   private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public Code02() {
    stack=new Stack<Integer>();
    minStack=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(!minStack.empty()){
            int min=minStack.peek();
            if(x<=min){
                minStack.push(x);
            }
        }else {
            minStack.push(x);
        }
    }

    public void pop() {
        int num=stack.peek();
        if(num==minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
