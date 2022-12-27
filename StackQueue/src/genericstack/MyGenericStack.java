package genericstack;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack = new LinkedList<T>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        T lastElement = stack.getLast();
        stack.removeLast();
        return lastElement;
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
//        boolean empty = true;
//        if(stack.isEmpty() != true){
//            empty = false;
//        }
//        return empty;
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
