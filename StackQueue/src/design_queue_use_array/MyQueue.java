package design_queue_use_array;

public class MyQueue {
    int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int size) {
        queueArr = new int[size];
        this.capacity = size;
    }

    public boolean isQueueFull() {
        return currentSize >= capacity;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Can't add elements because dequeue is full");
        } else {
            tail++;
            queueArr[tail] = item;
            System.out.println("Element " + item + " is pushed to Queue !");
            currentSize++;
        }
    }

    public void dequeue() {
        int getElement;
        if (isEmpty()) {
            System.out.println("Can't remove elements because dequeue is full");
        } else {
            getElement = queueArr[head];
            System.out.println("Pop operation done ! removed: " + getElement);
            int[] newElement = new int[capacity];
            currentSize--;
            System.arraycopy(queueArr, head + 1, newElement, 0, currentSize);
            queueArr = newElement;
        }
    }

    public void showQueue() {
        for (int i = head; i < currentSize; i++) {
            System.out.print(queueArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.showQueue();
        queue.dequeue();
        queue.showQueue();
    }
}