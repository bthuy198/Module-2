package arraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<E> {
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        elements = new Object[size];
    }

    public void ensureCapa() {
        int longerSize = elements.length * 2 + 1;
        elements = Arrays.copyOf(elements, longerSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void insert(int index, E e) {
        Object[] newElement = new Object[elements.length + 1];
        System.arraycopy(elements, 0, newElement, 0, index);
        newElement[index] = e;
        System.arraycopy(elements, index, newElement, index + 1, elements.length - index);
        elements = newElement;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
//        Object newElement = new Object[elements.length - 1];
//        System.arraycopy(elements, 0, newElement, 0, index);
//        System.arraycopy(elements, index + 1, newElement, index, newElement.length - index);
//        elements.length -= 1;
//        elements = newElement;
    }

    public int size() {
        return elements.length;
    }

    public E get(int i) {
        if (i >= elements.length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size " + i);
        }
        return (E) elements[i];
    }

    public MyArrayList clone() {
        MyArrayList clone = new MyArrayList(elements.length);
        for (Object e : elements) {
            clone.add(e);
        }
        return clone;
    }

    public boolean contains(Object o) {
        System.out.print(o + " contains in list? ");
        for (Object e : elements) {
            if (o.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                index = i;
            }
        }
        return index;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void showList() {
        for (Object item : elements) {
            System.out.println(item);
        }
    }

    public void addAll(Collection<E> collection ) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()){
            add(iterator.next());
        }
    }
}
