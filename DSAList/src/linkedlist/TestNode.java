package linkedlist;

public class TestNode {
    public static void main(String[] args) {
        MyLinkedList<Integer> n1 = new MyLinkedList();
        n1.addFirst(3);
        n1.addFirst(2);
        n1.addFirst(1);
        n1.addFirst(0);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.addLast(4);
        n1.addLast(5);
        n1.addLast(6);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.add(2, 9);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.add(n1.numNodes, 8);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.add(1, 1);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.removeFirst();
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.removeFirst();
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        System.out.println("------------");
        n1.removeLast();
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        n1.remove(3);
        n1.printLinkedList();
        System.out.println(n1.numNodes);
        System.out.println(n1.size());
        System.out.println(n1.indexOf(8));
        System.out.println(n1.getFirst());
        System.out.println(n1.getLast());
        System.out.println(n1.getNode(9));
        System.out.println(n1.indexOf(9));
        int number = 9;
        System.out.println(number + " contains in list? " + n1.contains(number));
        n1.remove(4);
        n1.remove(5);
        n1.printLinkedList();

        System.out.println("----clone----");
        MyLinkedList clone = n1.clone();
        clone.printLinkedList();
        System.out.println("----clear clone----");
        clone.clear();
        clone.printLinkedList();

    }
}
