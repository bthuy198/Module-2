import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        numbers.add(0);

        System.out.println("Danh sách ban đầu: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t");
        }

        //Lấy ra phần tử đầu tiên và xóa phần tử đó:
        System.out.println("\nPhần tử đầu tiên: " + numbers.poll());
        System.out.println("Phần tử đầu tiên: " + numbers.poll());

        numbers.offer(1);
        System.out.println("\nDanh sách ban đầu: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t");
        }
    }
}
