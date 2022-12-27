package design_stack_use_array;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isFull() {
        return index == size;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[index] = element;
            index++;
        }
    }

    public int pop() throws Exception {
        int element;
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        } else {
            element = arr[index - 1];
            index--;
            int[] newArr = new int[size];
            System.arraycopy(arr, 0, newArr, 0, index);
            arr = newArr;
        }
        return element;
    }

    public int size() {
        return this.index;
    }

    public void showStack() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        MyStack stack1 = new MyStack(5);

        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        stack1.showStack();
        System.out.println("1. Size of stack after push operations: " + stack1.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack1.isEmpty()) {
            System.out.printf(" %d", stack1.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack1.size());
    }

}
