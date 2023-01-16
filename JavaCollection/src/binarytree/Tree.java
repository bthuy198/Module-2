package binarytree;

public interface Tree<E> {
    boolean insert(E element);
    void inorder();
    int getSize();
}
