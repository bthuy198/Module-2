package arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInteger = new MyArrayList<Integer>();
        listInteger.add(2);
        listInteger.add(4);
        listInteger.add(1);
        listInteger.add(9);
        listInteger.insert(0, 1);
        showArray(listInteger);
        listInteger.remove(2);
        showArray(listInteger);

        MyArrayList<Integer> clone = listInteger.clone();
        showArray(clone);
        System.out.println(listInteger.contains(1));
        listInteger.clear();
        showArray(listInteger);
    }

    public static void showArray(MyArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
}
