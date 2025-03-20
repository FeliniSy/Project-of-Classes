public class ClassofStack {
    private int top;
    private int[] stack;

    public ClassofStack(){
        top = -1;
        stack = new int[10];
    }
    public void push(int item){
        stack[++top] = item;
    }
    public int pop(){
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int size(){
        return top + 1;
    }

}
