package linkedlistqueue;

public class MyLinkedListQueue<E> {
    private Node head;
    private Node tail;

    class Node {
        private Node next;
        int key;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(tail == null){
            this.head = this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }
    public Node dequeue(){
        Node dequeueNode;
        if(this.head == null){
            dequeueNode = null;
        }
        dequeueNode = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return dequeueNode;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.key + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedListQueue<Integer> listInteger = new MyLinkedListQueue<>();
        listInteger.enqueue(7);
        listInteger.enqueue(3);
        listInteger.enqueue(6);
        listInteger.enqueue(5);
        listInteger.show();
        listInteger.dequeue();
        listInteger.dequeue();
        listInteger.dequeue();
        listInteger.show();
    }
}
