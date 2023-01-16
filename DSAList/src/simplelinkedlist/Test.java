package simplelinkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> n1 = new LinkedList<>();
        n1.addFirst(1);
        n1.addFirst(3);
        n1.printList();
        n1.add(1, 4);
        n1.printList();
        System.out.println();
    }
}
