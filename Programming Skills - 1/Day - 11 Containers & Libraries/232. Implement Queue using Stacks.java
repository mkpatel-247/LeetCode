//Anuj Bhaiya Solution
class MyQueue {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        int remove = 0;
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        if(st1.empty()){
            remove = st2.pop();
            while(!st2.empty()){
                st1.push(st2.pop());
            }
        }
        return remove;
    }
    
    public int peek() {
        int top = 0;
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        if(st1.empty()){
            top = st2.peek();
            while(!st2.empty()){
                st1.push(st2.pop());
            }
        }
        return top;
    }
    
    public boolean empty() {
        if(st1.empty() && st2.empty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
 
 //Striver Solution -> Optimised Solution
