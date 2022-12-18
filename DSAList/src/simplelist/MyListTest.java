package simplelist;

import arraylist.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInteger = new MyArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.showList();
        System.out.println("---------");

        listInteger.remove(1);
        listInteger.showList();

        MyArrayList<Integer> cloneList = listInteger.clone();
        cloneList.showList();
        System.out.println("---------");

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        for(Integer number: numbers){
            System.out.print(number);
        }
        listInteger.addAll(numbers);
        listInteger.showList();
    }
}
